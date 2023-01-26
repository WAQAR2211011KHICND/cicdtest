package com.example.cicdtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class cicdController {
    
    @GetMapping
    public ResponseEntity<String> Hello(){
        return ResponseEntity.ok().body("Hello CI CD");
    }

}
