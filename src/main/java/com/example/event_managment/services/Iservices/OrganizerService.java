package com.example.event_managment.services.Iservices;

import com.example.event_managment.entities.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> findAll();
    Organizer save(Organizer organizer);
}
