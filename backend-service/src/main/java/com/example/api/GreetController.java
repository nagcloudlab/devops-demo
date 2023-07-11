package com.example.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/api/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Hello dxc!");
    }

}
