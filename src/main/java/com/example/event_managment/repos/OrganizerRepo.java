package com.example.event_managment.repos;

import com.example.event_managment.entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepo extends JpaRepository<Organizer, Integer> {
}
