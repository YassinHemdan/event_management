package com.example.event_managment.services.serviceImpl;

import com.example.event_managment.services.Iservices.EventService;
import com.example.event_managment.entities.Event;
import com.example.event_managment.repos.EventRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private EventRepo eventRepo;
    @Override
    public List<Event> findAll() {
        return eventRepo.findAll();
    }
}
