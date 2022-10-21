package com.example.week4.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "todos")
@Data
public class Todo {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "days",nullable = false)
    private Days days;

    @Column(name="weekOfNumber")
    private int weekByNumber;

    @Column(name = "done")
    private boolean done;
}
