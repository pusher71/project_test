package com.example.project_test.service;

import com.example.project_test.entity.EventDto;
import com.example.project_test.repository.EventRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        //сохранить исходный event
        EventDto dto = new EventDto(name);
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
