package com.es2.t1.controllers;

import com.es2.t1.domain.entities.ProjetoEntity;
import com.es2.t1.domain.repositories.ProjetoRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/projeto")
@AllArgsConstructor
public class ProjetoController {

    ProjetoRepositorie projetoRepositorie;

    @PostMapping
    public ResponseEntity<ProjetoEntity> create(@RequestBody ProjetoEntity projeto) {
        ProjetoEntity createdProjeto = projetoRepositorie.save(projeto);
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
