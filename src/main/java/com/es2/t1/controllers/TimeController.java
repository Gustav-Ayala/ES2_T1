package com.es2.t1.controllers;

import com.es2.t1.services.TimeServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/time")
public class TimeController {
    private final TimeServices timeServices;

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> readTime(@PathVariable Long id){
        return timeServices.readTime(id);
    }
}
