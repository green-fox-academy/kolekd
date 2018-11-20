package com.greenfox.frontend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Log {

    @Id
    @GeneratedValue
    long id;
    Timestamp createdAt;
    String endpoint;
    String data;

    public Log(String endpoint, String data) {
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.endpoint = endpoint;
        this.data = data;
    }

    public Log() {
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
