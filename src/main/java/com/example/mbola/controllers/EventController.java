package com.example.mbola.controllers;

import com.example.mbola.dtos.EventOrganizerDTO;
import com.example.mbola.services.serviceImpl.EventServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
@AllArgsConstructor
public class EventController {
    private final EventServiceImpl eventService;
    @GetMapping("/find-all")
    public List<EventOrganizerDTO> findAll(){
        return eventService.findAll();
    }
}
