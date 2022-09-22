package com.springcloud.reservationservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Reservation {
    
    private Long reservationId;
    private Date reservationDate;
}
