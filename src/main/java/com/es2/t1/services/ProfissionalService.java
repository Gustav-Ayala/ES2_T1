package com.es2.t1.services;

import com.es2.t1.domain.DTOs.ProfissionalDTO;
import com.es2.t1.domain.entities.EspecialidadeEntity;
import com.es2.t1.domain.entities.ProfissionalEntity;
import com.es2.t1.domain.repositories.EspecialidadeRepositorie;
import com.es2.t1.domain.repositories.ProfissionalRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfissionalService {
    private final ProfissionalRepositorie profissionalRepositorie;
    private final EspecialidadeRepositorie especialidadeRepositorie;

    public ResponseEntity<ProfissionalEntity> createProfissional(ProfissionalDTO profissional){

        ProfissionalEntity profissionalEntity = new ProfissionalEntity();
        profissionalEntity.setNome(profissional.getNome());
        profissionalEntity.setGenero(profissional.getGenero());
        profissionalEntity.setRaça(profissional.getRaça());
        profissionalEntity.setEndereço(profissional.getEndereço());

        Optional<EspecialidadeEntity> optEspecialidade = especialidadeRepositorie.findById(profissional.getIdEspecialidade());
        profissionalEntity.setDataNasc(profissional.getDataNasc());

        if(optEspecialidade.isPresent()){
            profissionalEntity.setEspecialidade(optEspecialidade.get());
        }

        profissionalEntity = profissionalRepositorie.save(profissionalEntity);
        return ResponseEntity.ok(profissionalEntity);
    }

    public ResponseEntity<?> readProfissional(Long id){
        Optional<ProfissionalEntity> profissionalEntity = profissionalRepositorie.findById(id);
        if(profissionalEntity.isPresent())
            return ResponseEntity.ok(profissionalEntity);
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<List<ProfissionalEntity>> readProfissional(){
        List<ProfissionalEntity> profissionais = (List<ProfissionalEntity>) profissionalRepositorie.findAll();
        return ResponseEntity.ok(profissionais);
    }

    public ResponseEntity<Void> deleteProfissional(Long id){
        profissionalRepositorie.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> updateProfissional(ProfissionalEntity profissionalEntity){
        profissionalRepositorie.save(profissionalEntity);
        return ResponseEntity.ok().build();
    }
}
