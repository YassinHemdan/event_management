package com.example.mbola.services.Iservices;

import com.example.mbola.dtos.OrganizerEventsDTO;
import com.example.mbola.entities.Organizer;

import java.util.List;

public interface OrganizerService {
    List<OrganizerEventsDTO> findAll();
    Organizer save(Organizer organizer);
}
