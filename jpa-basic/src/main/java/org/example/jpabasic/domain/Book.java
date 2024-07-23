package org.example.jpabasic.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Book extends Item {

    private String author;
    private String isbn;
}
