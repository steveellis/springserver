package com.springserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
    @PostMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello from test endpoint");
    }
}
