package com.example.mbola.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="ratings")
@NoArgsConstructor
public class Rating {


    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "clients_seq",
            allocationSize = 1
    )
    @Column(name = "rating_id")
    private int ratingId;
    @Column(name="client_id",nullable = false)
    private int clientId;
    @Column(name="event_id",nullable = false)
    private int eventId;

    @Column(name="score",nullable = false)
    private int score;
    @Column(name="comment")
    private String comment;
    @Column(name="action_date",nullable = false)
    private Date actionDate;

    public Rating(int ratingId, int clientId, int eventId, int score, String comment, Date actionDate) {
        this.ratingId = ratingId;
        this.clientId = clientId;
        this.eventId = eventId;
        this.score = score;
        this.comment = comment;
        this.actionDate = actionDate;
    }
}
