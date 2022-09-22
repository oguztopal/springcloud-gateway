package com.springcloud.reservationservice.service;

import com.springcloud.reservationservice.dto.Reservation;

import java.util.List;
public interface ReservationService {

    List<Reservation> reservationList();

}
