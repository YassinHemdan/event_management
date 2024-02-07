package com.example.event_managment.controllers;

import com.example.event_managment.entities.Organizer;
import com.example.event_managment.services.serviceImpl.OrganizerServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/organizers")
public class OrganizerController {
    private final OrganizerServiceImpl organizerService;
    @GetMapping("/find-all")
    public List<Organizer> findAll(){
        return organizerService.findAll();
    }

    @PostMapping("/add-organizer")
    public Organizer add(@RequestBody Organizer organizer){
        return organizerService.save(organizer);
    }
}
