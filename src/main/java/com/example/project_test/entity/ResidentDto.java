package com.example.project_test.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "resident", schema = "public")
public class ResidentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column
    private LocalDateTime arrived;

    public ResidentDto() {
    }

    public ResidentDto(String name, LocalDateTime arrived) {
        this.name = name;
        this.arrived = arrived;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getArrived() {
        return arrived;
    }

    public void setArrived(LocalDateTime arrived) {
        this.arrived = arrived;
    }
}
