package com.es2.t1.controllers;

import com.es2.t1.domain.entities.TimeEntity;
import com.es2.t1.services.TimeServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/time")
@CrossOrigin
public class TimeController {
    private final TimeServices timeServices;

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> readTime(@PathVariable Long id){
        return timeServices.readTime(id);
    }

    @PostMapping
    public ResponseEntity<TimeEntity> createTime(@RequestBody TimeEntity time) {
        return timeServices.createTime(time);
    }

    @GetMapping
    public ResponseEntity<List<TimeEntity>> readTime() {
        return timeServices.readTime();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TimeEntity> updateTime(@PathVariable Long id, @RequestBody TimeEntity time) {
        return timeServices.updateTime(id, time);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTime(@PathVariable Long id) {
        return timeServices.deleteTime(id);
    }

    @PostMapping("/{timeId}/{profissionalId}")
    public ResponseEntity<?> addProfissional(@PathVariable Long timeId, @PathVariable Long profissionalId) {
        return timeServices.addProfissional(timeId, profissionalId);
    }

    @PutMapping("/{timeId}/{profissionalId}")
    public ResponseEntity<?> removeProfissional(@PathVariable Long timeId, @PathVariable Long profissionalId) {
        return timeServices.removeProfissional(timeId, profissionalId);
    }


}

