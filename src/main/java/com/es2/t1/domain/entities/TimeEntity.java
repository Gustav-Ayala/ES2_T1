package com.es2.t1.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Time")
public class TimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profissional_id_seq")
    Long id;

    String nomeTime;
    @ManyToMany
    @JoinTable(
            name = "profissionalTime",
            joinColumns = @JoinColumn(name = "time_id"),
            inverseJoinColumns = @JoinColumn(name = "profissional_id"))
    List<ProfissionalEntity> idProfissionais;
}
