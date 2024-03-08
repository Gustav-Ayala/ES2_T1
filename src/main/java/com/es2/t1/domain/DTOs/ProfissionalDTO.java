package com.es2.t1.domain.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    Long id;
    String nome;
    String endereço;
    String genero;

    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataNasc;
    String raça;
    Long idEspecialidade;
}
