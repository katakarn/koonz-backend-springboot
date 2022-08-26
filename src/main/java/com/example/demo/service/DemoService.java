package com.example.demo.service;

import com.example.demo.model.DemoModel;
import com.example.demo.repo.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public DemoModel addDemo(DemoModel dataRequest) {
        return demoRepository.save(dataRequest);
    }

    public List<DemoModel> findAll() {
        return demoRepository.findAll();
    }

    public Map<String, String> delDemo(String id) {
        var delDemo = demoRepository.findById(id);
        if(delDemo.isPresent()) {
            demoRepository.delete(delDemo.get());
            Map<String, String> message = new HashMap<>();
            message.put("message", "delete success");
            return message;
        }
        else {
            Map<String, String> message = new HashMap<>();
            message.put("message", "id not found");
            return message;
        }
    }
}
