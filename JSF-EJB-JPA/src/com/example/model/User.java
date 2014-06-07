package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * 
 * This entity represents the human user.
 * 
 * @since 12 Apr 2012
 * @version 1.0.0
 * 
 */
@Entity
public class User {

    private int id;
    private String name;
    private String surname;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   @Size(min = 5)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(min = 5)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("id : ").append(getId())
            .append(", name : ").append(getName())
            .append(", surname : ").append(getSurname())
            .toString();
    }
}
