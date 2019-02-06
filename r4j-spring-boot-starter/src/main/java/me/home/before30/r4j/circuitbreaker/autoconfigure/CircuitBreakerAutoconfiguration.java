package me.home.before30.r4j.circuitbreaker.autoconfigure;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.configure.CircuitBreakerConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * https://github.com/resilience4j/resilience4j/blob/master/resilience4j-spring-boot/src/main/java/io/github/resilience4j/circuitbreaker/autoconfigure/CircuitBreakerAutoConfiguration.java
 *
 */

@Configuration
@ConditionalOnClass(CircuitBreaker.class)
@EnableConfigurationProperties(CircuitBreakerProperties.class)
@Import(CircuitBreakerConfiguration.class)
public class CircuitBreakerAutoconfiguration {

}
