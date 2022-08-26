package com.example.demo.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class DemoModel {
    @Id
    private String id;
    private String name;
}
