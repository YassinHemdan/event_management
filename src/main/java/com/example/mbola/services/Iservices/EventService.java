package com.example.mbola.services.Iservices;

import com.example.mbola.dtos.EventOrganizerDTO;
import java.util.List;

public interface EventService {
    List<EventOrganizerDTO> findAll();
}
