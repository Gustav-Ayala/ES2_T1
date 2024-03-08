package com.es2.t1.domain.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "Projeto")
public class    ProjetoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nomeProjeto;
    String nomeCliente;
    String objetivoProjeto;

    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataInicio;

    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataFim;
    float valorProjeto;

    @ManyToOne
    @JoinColumn(name = "id_time")
    TimeEntity timeResponsavel;
}
