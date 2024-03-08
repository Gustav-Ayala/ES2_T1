package com.es2.t1.domain.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "Profissional")
public class ProfissionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String endereço;
    String genero;

    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataNasc;
    String raça;
    @ManyToOne
    @JoinColumn(name = "id_especialidade")
    EspecialidadeEntity especialidade;

}
