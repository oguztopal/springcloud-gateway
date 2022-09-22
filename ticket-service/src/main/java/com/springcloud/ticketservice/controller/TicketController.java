package com.springcloud.ticketservice.controller;

import com.springcloud.ticketservice.dto.Ticket;
import com.springcloud.ticketservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/ticket")
@RestController
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @PostMapping(value = "/list")
    public ResponseEntity<List<Ticket>> ticketList() {
        return ResponseEntity.ok(ticketService.ticketList());
    }
}
