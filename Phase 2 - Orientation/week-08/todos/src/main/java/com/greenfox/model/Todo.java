package com.greenfox.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    long id;

    String title;
    boolean urgent;
    boolean done;

    public Todo(long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public Todo(String title){
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public Todo(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
