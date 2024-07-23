package org.example.jpabasic.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;
    private String etc;
}
