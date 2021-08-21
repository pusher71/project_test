package com.example.project_test.service;

import com.example.project_test.entity.RoomDto;

import java.util.List;

public interface RoomService {
    RoomDto create(String inputJSON);
    List<RoomDto> findAll();
}
