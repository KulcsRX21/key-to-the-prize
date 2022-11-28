package com.kulcsrx.keytotheprize.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`USER`")
public class User {
    @JsonProperty
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @JsonProperty
    @Column(nullable = false, unique = true)
    private final String name;

    @JsonProperty
    @Column(nullable = false, unique = true)
    private final String email;

    public User() {
        this.name = "";
        this.email = "";
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "User{id=" + id + ", name=" + name + ", email=" + email + "}";
    }
}
