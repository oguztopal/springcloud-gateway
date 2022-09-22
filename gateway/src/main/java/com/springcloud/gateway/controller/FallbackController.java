package com.springcloud.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fb")
public class FallbackController {

    @PostMapping(value = "/ticket")
    public ResponseEntity<HttpStatus> ticketFallback(){
        return ResponseEntity.ok(HttpStatus.SERVICE_UNAVAILABLE);
    }

    @PostMapping(value = "/reservation")
    public ResponseEntity<HttpStatus> reservationFallback(){
        return ResponseEntity.ok(HttpStatus.SERVICE_UNAVAILABLE);
    }
}
