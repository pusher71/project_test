package com.example.project_test.controller;

import com.example.project_test.entity.EventDto;
import com.example.project_test.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody String string) {
        eventService.create(string);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<List<EventDto>> getAll() {
        final List<EventDto> events = eventService.findAll();

        return events != null && !events.isEmpty()
                ? ResponseEntity.status(HttpStatus.OK).body(events)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
