package com.example.project_test.service;

import com.example.project_test.entity.ResidentDto;

import java.util.List;

public interface ResidentService {
    ResidentDto create(String inputJSON);
    List<ResidentDto> findAll();
}
