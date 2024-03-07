package com.es2.t1.controllers;

import com.es2.t1.domain.EspecialidadeEntity;
import com.es2.t1.services.EspecialidadeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/especialidade")
public class EspecialidadeController {
    private final EspecialidadeService especialidadeService;

    @GetMapping
    public ResponseEntity<?> readEspecialidade(){
        return especialidadeService.readEspecialidades();
    }
}
