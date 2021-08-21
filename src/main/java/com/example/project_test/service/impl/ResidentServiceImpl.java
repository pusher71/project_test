package com.example.project_test.service.impl;

import com.example.project_test.entity.ResidentDto;
import com.example.project_test.repository.ResidentRepository;
import com.example.project_test.service.ResidentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentServiceImpl implements ResidentService {
    @Autowired
    private ResidentRepository residentRepository;

    @Override
    public ResidentDto create(String inputJSON) {

        JSONObject jo = new JSONObject(inputJSON);
        String name = jo.getString("name");
        LocalDateTime arrived = LocalDateTime.parse(jo.getString("arrived"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        //сохранить исходный event
        ResidentDto dto = new ResidentDto(name, arrived);
        residentRepository.save(dto);

        //тут разная бизнес-логика

        return dto;
    }

    @Override
    public List<ResidentDto> findAll() {
        List<ResidentDto> residents = new ArrayList<>();
        residentRepository.findAll().forEach(residents::add);
        return residents;
    }
}
