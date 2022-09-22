package com.springcloud.ticketservice.service;

import com.springcloud.ticketservice.dto.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> ticketList();
}
