package com.es2.t1.controllers;

import com.es2.t1.domain.DTOs.ProfissionalDTO;
import com.es2.t1.domain.ProfissionalEntity;
import com.es2.t1.services.ProfissionalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProfissionalController {

    private final ProfissionalService profissionalService;

    @PostMapping(path = "/profissional")
    public ResponseEntity<ProfissionalEntity> createProfissional(@RequestBody ProfissionalDTO profissional){
        return profissionalService.createProfissional(profissional);
    }

}
