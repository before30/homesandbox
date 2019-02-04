package me.home.before30.homesandbox.failsafeex.example;

import net.jodah.failsafe.Execution;
import net.jodah.failsafe.RetryPolicy;

import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SuppressWarnings("unchecked")
public class RetryLoopExample {
    static List<Object> list;

    static {
        list = mock(List.class);
        when(list.size()).thenThrow(IllegalStateException.class, IllegalStateException.class).thenReturn(5);
    }

    public static void main(String[] args) throws InterruptedException {
        RetryPolicy retryPolicy = new RetryPolicy<>().handle(IllegalStateException.class).withBackoff(10, 40, ChronoUnit.MILLIS);
        Execution execution = new Execution(retryPolicy);

        while(!execution.isComplete()) {
            try {
                execution.complete(list.size());
            } catch (IllegalStateException e) {
                execution.recordFailure(e);

                Thread.sleep(execution.getWaitTime().toMillis());
            }
        }

    }
}
