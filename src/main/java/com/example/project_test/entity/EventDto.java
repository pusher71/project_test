package com.example.project_test.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event", schema = "public")
public class EventDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "momentstart")
    private LocalDateTime momentStart;

    @Column(name = "momentend")
    private LocalDateTime momentEnd;

    public EventDto() {
    }

    public EventDto(String name, LocalDateTime momentStart, LocalDateTime momentEnd) {
        this.name = name;
        this.momentStart = momentStart;
        this.momentEnd = momentEnd;
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

    public LocalDateTime getMomentStart() {
        return momentStart;
    }

    public void setMomentStart(LocalDateTime momentStart) {
        this.momentStart = momentStart;
    }

    public LocalDateTime getMomentEnd() {
        return momentEnd;
    }

    public void setMomentEnd(LocalDateTime momentEnd) {
        this.momentEnd = momentEnd;
    }
}
