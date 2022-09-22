package com.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    /*@Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/ticket/*")
                        .filters(f -> f.circuitBreaker(config -> config
                                .setName("ticketBreaker")
                                .setFallbackUri("forward:/fb/ticket")))
                        .uri("http://localhost:7071/"))
                .route(p -> p
                        .path("/reservation/*")
                        .filters(f -> f.circuitBreaker(config -> config
                                .setName("reservationBreaker")
                                .setFallbackUri("forward:/fb/reservation")))
                        .uri("http://localhost:7061/"))
                .build();
    }

    @Bean
    public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
        return factory -> {
            factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
                    .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
                    .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(7)).build())
                    .circuitBreakerConfig(CircuitBreakerConfig.custom().failureRateThreshold(10)
                            .slowCallRateThreshold(5)
                            .slowCallDurationThreshold(Duration.ofSeconds(3)).build()).build());
        };
    }*/

}
