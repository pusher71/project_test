package com.example.project_test.controller;

import com.example.project_test.entity.RoomDto;
import com.example.project_test.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody String string) {
        roomService.create(string);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<List<RoomDto>> getAll() {
        final List<RoomDto> rooms = roomService.findAll();

        return rooms != null && !rooms.isEmpty()
                ? ResponseEntity.status(HttpStatus.OK).body(rooms)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
