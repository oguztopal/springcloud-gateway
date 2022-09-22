package com.springcloud.reservationservice.service.impl;

import com.springcloud.reservationservice.dto.Reservation;
import com.springcloud.reservationservice.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Override
    public List<Reservation> reservationList() {
        List<Reservation> reservationList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Reservation reservation = Reservation.builder().reservationId(ThreadLocalRandom.current().nextLong(100))
                    .reservationDate(new Date()).build();

            reservationList.add(reservation);
        }
        return reservationList;
    }
}
