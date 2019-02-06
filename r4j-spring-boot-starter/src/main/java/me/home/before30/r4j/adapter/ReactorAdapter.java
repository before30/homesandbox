package me.home.before30.r4j.adapter;

import io.github.resilience4j.core.EventPublisher;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

public class ReactorAdapter {

    public static <T> Flux<T> toFlux(EventPublisher<T> eventPublisher) {
        DirectProcessor<T> directProcessor = DirectProcessor.create();
        eventPublisher.onEvent(directProcessor::onNext);
        return directProcessor;
    }
}
