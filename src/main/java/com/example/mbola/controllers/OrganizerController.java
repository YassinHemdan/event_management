package com.example.mbola.controllers;

import com.example.mbola.dtos.OrganizerEventsDTO;
import com.example.mbola.entities.Organizer;
import com.example.mbola.services.serviceImpl.OrganizerServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/organizers")
public class OrganizerController {
    private final OrganizerServiceImpl organizerService;
    @GetMapping("/find-all")
    public List<OrganizerEventsDTO> findAll(){
        return organizerService.findAll();
    }

    @PostMapping("/add-organizer")
    public Organizer add(@RequestBody Organizer organizer){
        return organizerService.save(organizer);
    }
}
