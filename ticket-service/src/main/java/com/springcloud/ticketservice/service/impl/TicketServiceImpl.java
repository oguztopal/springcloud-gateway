package com.springcloud.ticketservice.service.impl;

import com.springcloud.ticketservice.dto.Ticket;
import com.springcloud.ticketservice.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class TicketServiceImpl implements TicketService {

    /**
     * @return List<Ticket>
     *     no params
     */
    @Override
    public List<Ticket> ticketList() {
        List<Ticket> ticketList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Ticket ticket = Ticket.builder().ticketId(ThreadLocalRandom.current().nextLong(100))
                    .ticketDate(new Date())
                    .ticketNumber(ThreadLocalRandom.current().nextLong(10000)).build();
            ticketList.add(ticket);
        }
        return ticketList;
    }
}
