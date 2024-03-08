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
public class ProjetoDTO {
    Long id;
    String nomeProjeto;
    String nomeCliente;
    String objetivoProjeto;

    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataInicio;

    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataFim;
    float valorProjeto;
    Long idTime;
}
