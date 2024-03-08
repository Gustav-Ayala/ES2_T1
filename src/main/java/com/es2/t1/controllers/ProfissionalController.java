package com.es2.t1.controllers;

import com.es2.t1.domain.DTOs.ProfissionalDTO;
import com.es2.t1.domain.entities.ProfissionalEntity;
import com.es2.t1.services.ProfissionalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/profissional")
public class ProfissionalController {

    private final ProfissionalService profissionalService;

    @PostMapping
    public ResponseEntity<ProfissionalEntity> createProfissional(@RequestBody ProfissionalDTO profissional){
        return profissionalService.createProfissional(profissional);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> readProfissional(@PathVariable Long id){
        return profissionalService.readProfissional(id);
    }

    @GetMapping
    public ResponseEntity<?> readProfissional(){
        return profissionalService.readProfissional();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Void> updateProfissional(@RequestBody ProfissionalEntity profissionalEntity, @PathVariable Long id){
        profissionalEntity.setId(id);
        return profissionalService.updateProfissional(profissionalEntity);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        return profissionalService.deleteProfissional(id);
    }

}
