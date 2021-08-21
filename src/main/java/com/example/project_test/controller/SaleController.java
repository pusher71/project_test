package com.example.project_test.controller;

import com.example.project_test.entity.SaleDto;
import com.example.project_test.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody String string) {
        saleService.create(string);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<List<SaleDto>> getAll() {
        final List<SaleDto> sales = saleService.findAll();

        return sales != null && !sales.isEmpty()
                ? ResponseEntity.status(HttpStatus.OK).body(sales)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
