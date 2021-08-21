package com.example.project_test.entity;

import javax.persistence.*;

@Entity
@Table(name = "room", schema = "public")
public class RoomDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String number;

    @Column
    private int floor;

    @Column
    private double square;

    public RoomDto() {
    }

    public RoomDto(String number, int floor, double square) {
        this.number = number;
        this.floor = floor;
        this.square = square;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }
}
