package com.example.project_test.service.impl;

import com.example.project_test.entity.RoomDto;
import com.example.project_test.repository.RoomRepository;
import com.example.project_test.service.RoomService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public RoomDto create(String inputJSON) {

        JSONObject jo = new JSONObject(inputJSON);
        String number = jo.getString("number");
        int floor = jo.getInt("floor");
        double square = jo.getDouble("square");

        //сохранить исходный sale
        RoomDto dto = new RoomDto(number, floor, square);
        roomRepository.save(dto);

        //тут разная бизнес-логика

        return dto;
    }

    @Override
    public List<RoomDto> findAll() {
        List<RoomDto> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }
}
