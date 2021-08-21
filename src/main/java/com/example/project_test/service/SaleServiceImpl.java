package com.example.project_test.service;

import com.example.project_test.entity.SaleDto;
import com.example.project_test.repository.SaleRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Override
    public SaleDto create(String inputJSON) {

        JSONObject jo = new JSONObject(inputJSON);
        String name = jo.getString("name");
        int eventId = jo.getInt("event_id");
        int summ = jo.getInt("summ");
        LocalDateTime timestamp = LocalDateTime.parse(jo.getString("timestamp"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        //сохранить исходный sale
        SaleDto dto = new SaleDto(name, eventId, summ, timestamp);
        saleRepository.save(dto);

        //тут разная бизнес-логика

        return dto;
    }

    @Override
    public List<SaleDto> findAll() {
        List<SaleDto> sales = new ArrayList<>();
        saleRepository.findAll().forEach(sales::add);
        return sales;
    }
}
