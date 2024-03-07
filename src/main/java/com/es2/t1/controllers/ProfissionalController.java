package com.es2.t1.controllers;

import com.es2.t1.domain.DTOs.ProfissionalDTO;
import com.es2.t1.domain.ProfissionalEntity;
import com.es2.t1.services.ProfissionalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
