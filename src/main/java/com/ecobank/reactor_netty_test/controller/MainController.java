package com.ecobank.reactor_netty_test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MainController {
    // Simple route returning a Mono (0 or 1 value)
    @GetMapping("/mono-netty")
    public Mono<String> getMono() {
        return Mono.just("Hello from Mono");
    }

    // Simple route returning a Flux (0 or N values)
    @GetMapping("/flux-netty")
    public Flux<String> getFlux() {
        return Flux.just("Hello", " from", " Flux", " from netty", "!");
    }
}
