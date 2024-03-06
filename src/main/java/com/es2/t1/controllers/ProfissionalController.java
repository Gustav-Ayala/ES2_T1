package com.es2.t1.controllers;

import com.es2.t1.domain.DTOs.ProfissionalDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfissionalController {


    @PostMapping(path = "/profissional")
    public ProfissionalDTO createProfissional(@RequestBody ProfissionalDTO profissional){
        return null;
    }
}
