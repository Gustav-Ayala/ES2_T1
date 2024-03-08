package com.es2.t1.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeDTO {
    int id;
    String nomeTime;
    List<ProfissionalDTO> profissionais;
}
