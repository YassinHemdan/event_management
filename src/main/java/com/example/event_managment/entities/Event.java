package com.example.event_managment.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "organizer_sequence",
            allocationSize = 1
    )
    @Column(name = "event_id")
    private int id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(nullable = false)
    private LocalDate start_date;
    @Column(nullable = false)
    private LocalDate end_date;
    @Column(nullable = false)
    private LocalTime start_time;
    @Column(nullable = false)
    private LocalTime end_time;
    @Column(nullable = false)
    private double latitude;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private int capacity;

//    @ManyToOne
//    @JoinColumn(name = "organizer_id", referencedColumnName = "organizer_id")
//    @JsonBackReference
//    private Organizer organizer;
}
