package com.es2.t1.domain.repositories;

import com.es2.t1.domain.ProfissionalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepositorie extends CrudRepository<ProfissionalEntity, Long> {
}
