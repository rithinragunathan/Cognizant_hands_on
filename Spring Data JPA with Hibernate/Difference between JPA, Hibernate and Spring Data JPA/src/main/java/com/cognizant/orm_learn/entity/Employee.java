package com.cognizant.orm_learn.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee", schema = "orm")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private int id;
}
