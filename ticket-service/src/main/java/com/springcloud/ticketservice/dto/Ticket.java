package com.springcloud.ticketservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Ticket {

    private Long ticketId;
    private Long ticketNumber;
    private Date ticketDate;
}
