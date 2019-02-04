package me.home.before30.homesandbox.failsafeex.example;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class AsyncExample {
    static ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
    static RetryPolicy<Object> retryPolicy = new RetryPolicy<>()
            .withDelay(Duration.ofMillis(100))
            .withJitter(.25);
    static Service service = new Service();

    public static class Service {
        AtomicInteger failures = new AtomicInteger();

        CompletableFuture<Boolean> connect() {
            CompletableFuture<Boolean> future = new CompletableFuture<>();
            executor.submit(() -> {
                if (failures.getAndIncrement() < 3)
                    future.completeExceptionally(new RuntimeException());
                else
                    future.complete(true);
            });
            return future;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Failsafe.with(retryPolicy)
                .with(executor)
                .getAsyncExecution(execution ->
                        service.connect().whenComplete((result, failure) -> {
                            if (execution.complete(result, failure))
                                System.out.println("Success");
                            else if (!execution.retry())
                                System.out.println("Connection attempts failed");
                        }));

        Thread.sleep(3000);
    }
}
