package com.logbook_spring_example.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class IndexController {
    @GetMapping()
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("I am alive!", HttpStatus.OK);
    }

    @PostMapping("/echo")
    public ResponseEntity<Object> echo(@RequestBody final Object object) {
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
}
