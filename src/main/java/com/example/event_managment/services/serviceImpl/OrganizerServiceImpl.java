package com.example.event_managment.services.serviceImpl;

import com.example.event_managment.entities.Organizer;
import com.example.event_managment.repos.OrganizerRepo;
import com.example.event_managment.services.Iservices.OrganizerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {
    private final OrganizerRepo organizerRepo;
//    @Autowired
//    public OrganizerServiceImpl(OrganizerRepo organizerRepo){
//        this.organizerRepo = organizerRepo;
//    }
    @Override
    public List<Organizer> findAll() {
        return organizerRepo.findAll();
    }
    @Override
    public Organizer save(Organizer organizer){
        return organizerRepo.save(organizer);
    }
}
