package com.example.name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    private String getName(){
        return "<h1>Isabella</h1>";
    }
}
