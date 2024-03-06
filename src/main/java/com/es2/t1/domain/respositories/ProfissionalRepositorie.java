package com.es2.t1.domain.respositories;

import com.es2.t1.domain.Profissional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepositorie extends CrudRepository<Profissional, Long> {
}
