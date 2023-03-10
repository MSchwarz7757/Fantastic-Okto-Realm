package com.OktoRealm.OktoRealmGraphQLAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TaskTable")
public class Tasks {
    @Id
    @GeneratedValue
    int id;

    String name;
    String description;

    public Tasks(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Tasks() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
