package com.example.project_test.service;

import com.example.project_test.entity.EventDto;

import java.util.List;

public interface EventService {
    EventDto create(String inputJSON);
    List<EventDto> findAll();
}
