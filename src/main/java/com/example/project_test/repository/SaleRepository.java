package com.example.project_test.repository;

import com.example.project_test.entity.SaleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleDto, Integer> {

}
