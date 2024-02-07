package com.example.event_managment.repos;

import com.example.event_managment.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {
//    void specialQuery();
}
