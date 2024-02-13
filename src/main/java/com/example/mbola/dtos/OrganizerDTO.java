package com.example.mbola.dtos;

import com.example.mbola.entities.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrganizerDTO {
    private String firstName;
    private String lastName;
    private Contact contact;
    private String bio;
}
