package me.home.before30.r4j.circuitbreaker.autoconfigure;

import io.github.resilience4j.circuitbreaker.configure.CircuitBreakerConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "resilience4j.circuitbreaker")
public class CircuitBreakerProperties extends CircuitBreakerConfigurationProperties {
}
