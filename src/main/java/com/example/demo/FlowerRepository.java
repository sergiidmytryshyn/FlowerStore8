package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.item.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
