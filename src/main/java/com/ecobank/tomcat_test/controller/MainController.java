package com.ecobank.tomcat_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MainController {
    @GetMapping("/mono-tomcat")
    public Mono<String> getMono() {
        return Mono.just("Hello from Mono");
    }

    @GetMapping("/flux-tomcat")
    public Flux<String> getFlux() {
        return Flux.just("Hello", " from", " Flux", " with Tomcat!");
    }
}
