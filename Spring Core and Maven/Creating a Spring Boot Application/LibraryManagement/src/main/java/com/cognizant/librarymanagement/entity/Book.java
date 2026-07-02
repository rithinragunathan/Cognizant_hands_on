package com.cognizant.librarymanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "library_management", schema = "demo")
public class Book {
    @Id
    @Column(name = "s_no")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;
}
