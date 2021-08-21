package com.example.project_test.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sale", schema = "public")
public class SaleDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "event_id", nullable = false)
    private int eventId;

    @Column
    private int summ;

    @Column
    private LocalDateTime timestamp;

    public SaleDto() {
    }

    public SaleDto(String name, int eventId, int summ, LocalDateTime timestamp) {
        this.name = name;
        this.eventId = eventId;
        this.summ = summ;
        this.timestamp = timestamp;
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

    public int getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(Integer summ) {
        this.summ = summ;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
