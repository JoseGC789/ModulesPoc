package com.josegc789.web.controllers;

import com.josegc789.simple.function.PointOfView;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final PointOfView springView;
    private final PointOfView loaderView;

    public TestController(@Qualifier("spring") PointOfView springView, @Qualifier("loader") PointOfView loaderView) {
        this.springView = springView;
        this.loaderView = loaderView;
    }

    @GetMapping("/spring/{app}")
    public ResponseEntity<Object> testSpring(@PathVariable String app){
        return ResponseEntity.ok(springView.respond(app));
    }

    @GetMapping("/loader/{app}")
    public ResponseEntity<Object> testLoader(@PathVariable String app){
        return ResponseEntity.ok(loaderView.respond(app));
    }
}
