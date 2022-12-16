package com.springcloud.reservationservice.controller;

import com.springcloud.reservationservice.dto.Reservation;
import com.springcloud.reservationservice.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/reservation")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ReservationController {

    private final ReservationService reservationService;


    @PostMapping(value = "/list")
    public ResponseEntity<List<Reservation>> reservationList(){
        return ResponseEntity.ok(reservationService.reservationList());
    }
}
