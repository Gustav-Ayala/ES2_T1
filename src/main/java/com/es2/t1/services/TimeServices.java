package com.es2.t1.services;

import com.es2.t1.domain.entities.TimeEntity;
import com.es2.t1.domain.repositories.TimeRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TimeServices {
    private final TimeRepositorie timeRepositorie;

    public ResponseEntity<TimeEntity> readTime(Long id){
        Optional<TimeEntity> timeEntity = timeRepositorie.findById(id);
        if(timeEntity.isPresent())
            return ResponseEntity.ok(timeEntity.get());
        return ResponseEntity.notFound().build();
    }

}
