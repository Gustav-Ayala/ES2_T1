package com.es2.t1.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Especialidade")
public class EspecialidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "especialidade_id_seq")
    int id;
    String descricao;
}
