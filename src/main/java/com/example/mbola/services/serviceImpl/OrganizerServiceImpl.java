package com.example.mbola.services.serviceImpl;

import com.example.mbola.dtos.OrganizerEventsDTO;
import com.example.mbola.entities.Organizer;
import com.example.mbola.repos.OrganizerRepo;
import com.example.mbola.services.Iservices.OrganizerService;
import com.example.mbola.utils.Converter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {
    private final OrganizerRepo organizerRepo;
    private final Converter converter = new Converter();
    @Override
    public List<OrganizerEventsDTO> findAll() {
        return converter.toList(organizerRepo.findAll(), OrganizerEventsDTO.class);
    }
    @Override
    public Organizer save(Organizer organizer){
        return organizerRepo.save(organizer);
    }
}
