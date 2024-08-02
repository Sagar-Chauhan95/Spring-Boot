package com.practice.crud.model;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @ManyToOne
    private Author author;
    private String publisher;
    private String isbn;

}
