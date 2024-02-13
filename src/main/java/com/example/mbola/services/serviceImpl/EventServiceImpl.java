package com.example.mbola.services.serviceImpl;

import com.example.mbola.dtos.EventOrganizerDTO;
import com.example.mbola.services.Iservices.EventService;
import com.example.mbola.repos.EventRepo;
import com.example.mbola.utils.Converter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private EventRepo eventRepo;
    private final Converter converter = new Converter();
    @Override
    public List<EventOrganizerDTO> findAll() {
        return converter.toList(eventRepo.findAll(), EventOrganizerDTO.class);
    }
}
