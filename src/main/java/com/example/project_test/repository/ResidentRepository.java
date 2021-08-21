package com.example.project_test.repository;

import com.example.project_test.entity.ResidentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<ResidentDto, Integer> {

}
