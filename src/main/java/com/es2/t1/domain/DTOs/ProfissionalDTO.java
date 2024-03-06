package com.es2.t1.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfissionalDTO {
    int id;
    String nome;
    String endereço;
    String genero;
    LocalDate dataNasc;
    String raça;
    EspecialidadeDTO especialidade;

}
