package com.practice.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    private int id;
    private String name;
    private String surname;

    @OneToMany
    private List<Book> books ;
}
