package com.example.project_test.controller;

import com.example.project_test.entity.ResidentDto;
import com.example.project_test.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody String string) {
        residentService.create(string);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<List<ResidentDto>> getAll() {
        final List<ResidentDto> residents = residentService.findAll();

        return residents != null && !residents.isEmpty()
                ? ResponseEntity.status(HttpStatus.OK).body(residents)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
