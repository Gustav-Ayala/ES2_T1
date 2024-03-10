package com.es2.t1.controllers;

import com.es2.t1.domain.DTOs.ProjetoDTO;
import com.es2.t1.domain.entities.ProjetoEntity;
import com.es2.t1.domain.entities.TimeEntity;
import com.es2.t1.domain.repositories.ProjetoRepositorie;
import com.es2.t1.domain.repositories.TimeRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/projeto")
@AllArgsConstructor
@CrossOrigin
public class ProjetoController {

    ProjetoRepositorie projetoRepositorie;

    TimeRepositorie timeRepositorie;

    @PostMapping
    public ResponseEntity<ProjetoEntity> create(@RequestBody ProjetoDTO projeto) {
        ProjetoEntity createdProjeto = new ProjetoEntity();
        createdProjeto.setNomeProjeto(projeto.getNomeProjeto());
        createdProjeto.setObjetivoProjeto(projeto.getObjetivoProjeto());
        createdProjeto.setValorProjeto(projeto.getValorProjeto());
        createdProjeto.setDataFim(projeto.getDataFim());
        createdProjeto.setDataInicio(projeto.getDataInicio());
        Optional<TimeEntity> timeResponsavel = timeRepositorie.findById(projeto.getIdTime());
        createdProjeto.setTimeResponsavel(timeResponsavel.get());
        createdProjeto.setNomeCliente(projeto.getNomeCliente());
        projetoRepositorie.save(createdProjeto);
        return ResponseEntity.ok(createdProjeto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoEntity> findById(@PathVariable Long id) {
        Optional<ProjetoEntity> projeto = projetoRepositorie.findById(id);

        return ResponseEntity.ok(projeto.get());
    }

    @GetMapping
    public ResponseEntity<List<ProjetoEntity>> findAll() {
        List<ProjetoEntity> projetos = (List<ProjetoEntity>) projetoRepositorie.findAll();
        return ResponseEntity.ok(projetos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjetoEntity> update(@PathVariable Long id, @RequestBody ProjetoEntity projeto) {
        projeto.setId(id);
        ProjetoEntity updatedProjeto = projetoRepositorie.save(projeto);
        return ResponseEntity.ok(updatedProjeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        projetoRepositorie.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
