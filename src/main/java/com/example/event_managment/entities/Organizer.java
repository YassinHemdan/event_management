package com.example.event_managment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "organizers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organizer {
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
    @Column(name = "organizer_id")
    private int id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Embedded
    @Column(nullable = false)
    private Contact contact;
    private String bio;

    @OneToMany
//    @JsonManagedReference
    private List<Event> events;
}
