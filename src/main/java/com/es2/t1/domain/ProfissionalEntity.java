package com.es2.t1.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Profissional")
public class ProfissionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profissional_id_seq")
    int id;
    String nome;
    String endereço;
    String genero;
    LocalDate dataNasc;
    String raça;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_especialidade")
    EspecialidadeEntity especialidade;
}
