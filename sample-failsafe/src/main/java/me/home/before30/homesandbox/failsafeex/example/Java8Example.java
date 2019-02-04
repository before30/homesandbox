package me.home.before30.homesandbox.failsafeex.example;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Example {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        RetryPolicy<Object> retryPolicy = new RetryPolicy<>();

        Function<String, String> bar = value -> Failsafe.with(retryPolicy).get(() -> value + "bar");

        Failsafe.with(retryPolicy).get(() -> Stream.of("foo")
            .map(value -> Failsafe.with(retryPolicy).get(() -> value + "bar"))
            .collect(Collectors.toList()));

        Stream.of("foo").map(value -> Failsafe.with(retryPolicy).get(() -> value + "bar")).forEach(System.out::println);

        Failsafe.with(retryPolicy).with(executor).getStageAsync(() -> CompletableFuture.supplyAsync(() -> "foo")
            .thenApplyAsync(value -> value + "bar")
            .thenAccept(System.out::println));

        CompletableFuture.supplyAsync(() -> Failsafe.with(retryPolicy).get(() -> "foo"))
                .thenApplyAsync(value -> Failsafe.with(retryPolicy).get(() -> value + "bar"))
                .thenAccept(System.out::println);
    }
}
