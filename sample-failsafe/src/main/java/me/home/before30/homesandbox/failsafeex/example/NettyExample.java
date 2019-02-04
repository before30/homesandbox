package me.home.before30.homesandbox.failsafeex.example;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;

import java.time.Duration;

public class NettyExample {
    static final String HOST = System.getProperty("host", "127.0.0.1");
    static final int PORT = Integer.parseInt(System.getProperty("port", "8007"));

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = createBootstrap(group);
        RetryPolicy<Object> retryPolicy = new RetryPolicy<>()
                .withDelay(Duration.ofSeconds(1));

        Failsafe.with(retryPolicy).with(group).runAsyncExecution(
                execution -> bootstrap.connect(HOST, PORT)
                        .addListener((ChannelFutureListener) channelFuture -> {
                            if (channelFuture.isSuccess()) {
                                System.out.println("Connected!");
                                try {
                                    channelFuture.sync();
                                    channelFuture.channel().closeFuture().sync();
                                } catch (Exception ignore) {
                                    group.shutdownGracefully();
                                }
                            } else if (!execution.retryOn(channelFuture.cause()))
                                System.out.println("Connection attempts failed");
                        })
        );

        Thread.sleep(5000);
    }

    private static Bootstrap createBootstrap(EventLoopGroup group) {
        Bootstrap handler = new Bootstrap().group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                            @Override
                            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                ctx.write(msg);
                            }

                            @Override
                            public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
                                ctx.flush();
                            }

                            @Override
                            public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
                                cause.printStackTrace();
                                ctx.close();
                            }
                        });
                    }
                });

        return handler;
    }
}
