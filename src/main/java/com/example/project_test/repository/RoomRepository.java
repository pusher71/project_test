package com.example.project_test.repository;

import com.example.project_test.entity.RoomDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomDto, Integer> {

}
