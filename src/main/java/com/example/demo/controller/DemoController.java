package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.DemoModel;

@CrossOrigin
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @GetMapping("")
    List<DemoModel> index() {
        return demoService.findAll();
    }

    @PostMapping("")
    DemoModel create(@RequestBody DemoModel demoModel) {
        return demoService.addDemo(demoModel);
    }

    @DeleteMapping("/{id}")
    Map<String, String> del(@PathVariable String id){
        return demoService.delDemo(id);
    }

}
