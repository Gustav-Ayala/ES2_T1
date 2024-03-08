package com.es2.t1.services;

import com.es2.t1.domain.DTOs.TimeDTO;
import com.es2.t1.domain.entities.ProfissionalEntity;
import com.es2.t1.domain.entities.TimeEntity;
import com.es2.t1.domain.repositories.ProfissionalRepositorie;
import com.es2.t1.domain.repositories.TimeRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TimeServices {
    private final TimeRepositorie timeRepositorie;
    private final ProfissionalRepositorie profissionalRepositorie;

    public ResponseEntity<TimeEntity> readTime(Long id){
        Optional<TimeEntity> timeEntity = timeRepositorie.findById(id);
        if(timeEntity.isPresent())
            return ResponseEntity.ok(timeEntity.get());
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<TimeEntity> createTime(TimeEntity time) {
        TimeEntity createdTime = timeRepositorie.save(time);
        return ResponseEntity.ok(createdTime);
    }

    public ResponseEntity<List<TimeEntity>> readTime(){
        List<TimeEntity> times = (List<TimeEntity>) timeRepositorie.findAll();
        return ResponseEntity.ok(times);
    }

    public ResponseEntity<TimeEntity> updateTime(Long id, TimeEntity time) {
        time.setId(id);
        TimeEntity updatedTime = timeRepositorie.save(time);
        return ResponseEntity.ok(updatedTime);
    }

    public ResponseEntity<?> deleteTime(Long id) {
        timeRepositorie.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<?> addProfissional(Long timeId, Long profissionalId) {
        Optional<TimeEntity> timeOpt = timeRepositorie.findById(timeId);
        Optional<ProfissionalEntity> profissionalOpt = profissionalRepositorie.findById(profissionalId);

        TimeEntity time = timeOpt.get();
        ProfissionalEntity profissional = profissionalOpt.get();
        time.getIdProfissionais().add(profissional);
        timeRepositorie.save(time);
        return ResponseEntity.ok().body("Profissional adicionado ao time com sucesso!");
    }

    public ResponseEntity<?> removeProfissional(Long timeId, Long profissionalId) {
        Optional<TimeEntity> timeOpt = timeRepositorie.findById(timeId);
        Optional<ProfissionalEntity> profissionalOpt = profissionalRepositorie.findById(profissionalId);

        TimeEntity time = timeOpt.get();
        ProfissionalEntity profissional = profissionalOpt.get();
        time.getIdProfissionais().remove(profissional);
        timeRepositorie.save(time);
        return ResponseEntity.ok().body("Profissional removido do time com sucesso!");
    }


}
