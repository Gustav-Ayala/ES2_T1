package com.es2.t1.domain.entities;


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
@Table(name = "Time")
public class    ProjetoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profissional_id_seq")
    Long id;
    String nomeCliente;
    String objetivoProjeto;
    LocalDate dataInicio;
    LocalDate dataFim;
    float valorProjeto;

    @ManyToOne
    @JoinColumn(name = "id_time")
    TimeEntity timeResponsavel;
}
