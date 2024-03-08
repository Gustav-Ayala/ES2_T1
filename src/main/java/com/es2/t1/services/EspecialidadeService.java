package com.es2.t1.services;


import com.es2.t1.domain.entities.EspecialidadeEntity;
import com.es2.t1.domain.repositories.EspecialidadeRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EspecialidadeService {
    EspecialidadeRepositorie especialidadeRepositorie;

    public ResponseEntity<List<EspecialidadeEntity>> readEspecialidades(){
        List<EspecialidadeEntity> especialidades = (List<EspecialidadeEntity>) especialidadeRepositorie.findAll();
        return ResponseEntity.ok(especialidades);
    }
}
