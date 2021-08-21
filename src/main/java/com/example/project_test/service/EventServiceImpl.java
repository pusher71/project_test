package com.example.project_test.service;

import com.example.project_test.entity.EventDto;
import com.example.project_test.repository.EventRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public EventDto create(String inputJSON) {

        JSONObject jo = new JSONObject(inputJSON);
        String name = jo.getString("name");
        LocalDateTime momentStart = LocalDateTime.parse(jo.getString("momentstart"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime momentEnd = LocalDateTime.parse(jo.getString("momentend"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        //сохранить исходный event
        EventDto dto = new EventDto(name, momentStart, momentEnd);
        eventRepository.save(dto);

        //тут разная бизнес-логика

        return dto;
    }

    @Override
    public List<EventDto> findAll() {
        List<EventDto> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }
}
