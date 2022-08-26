package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.DemoModel;

public interface DemoRepository extends MongoRepository<DemoModel, String>{
    
}
