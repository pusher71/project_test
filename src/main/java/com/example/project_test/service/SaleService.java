package com.example.project_test.service;

import com.example.project_test.entity.SaleDto;

import java.util.List;

public interface SaleService {
    SaleDto create(String inputJSON);
    List<SaleDto> findAll();
}
