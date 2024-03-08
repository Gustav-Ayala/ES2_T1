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
public class ProjetoDTO {
    Long id;
    String nomeCliente;
    String objetivoProjeto;
    LocalDate dataInicio;
    LocalDate dataFim;
    float valorProjeto;
    int idTime;
}
