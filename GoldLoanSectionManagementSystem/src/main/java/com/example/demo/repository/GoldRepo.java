package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Gold;
@Repository
public interface GoldRepo extends JpaRepository<Gold,Integer> {

}
