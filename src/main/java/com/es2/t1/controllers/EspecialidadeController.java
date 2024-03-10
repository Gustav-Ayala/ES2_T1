package com.es2.t1.controllers;

import com.es2.t1.services.EspecialidadeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/especialidade")
@CrossOrigin
public class EspecialidadeController {
    private final EspecialidadeService especialidadeService;

    @GetMapping
    public ResponseEntity<?> readEspecialidade(){
        return especialidadeService.readEspecialidades();
    }
}
