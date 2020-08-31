package com.jaxs.apple.model;

import javax.persistence.*;

@Entity
@Table(name = "device")
public class Device {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "type")
    private String type;

    public Device() {
    }

    public Device(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
