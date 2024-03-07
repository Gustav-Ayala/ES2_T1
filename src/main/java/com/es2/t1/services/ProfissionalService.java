package com.es2.t1.services;

import com.es2.t1.domain.DTOs.ProfissionalDTO;
import com.es2.t1.domain.ProfissionalEntity;
import com.es2.t1.domain.repositories.ProfissionalRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@AllArgsConstructor
@RequestMapping(path = "/profissional")
public class ProfissionalService {
    private final ProfissionalRepositorie profissionalRepositorie;

    public ResponseEntity<ProfissionalEntity> createProfissional(ProfissionalDTO profissional){

        ProfissionalEntity profissionalEntity = new ProfissionalEntity();
        profissionalEntity.setId(profissional.getId());
        profissionalEntity.setNome(profissional.getNome());
        profissionalEntity.setGenero(profissional.getGenero());
        profissionalEntity.setRaça(profissional.getRaça());
        profissionalEntity.setEndereço(profissional.getEndereço());

        //profissionalEntity.setEspecialidade();        TODO: findbyid FOREIGN KEY

        profissionalEntity.setDataNasc(profissional.getDataNasc());
        profissionalEntity = profissionalRepositorie.save(profissionalEntity);
        return ResponseEntity.ok(profissionalEntity);
    }

}
