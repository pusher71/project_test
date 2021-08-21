package com.example.project_test.repository;

import com.example.project_test.entity.EventDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventDto, Integer> {

}
