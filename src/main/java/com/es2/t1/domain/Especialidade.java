package com.es2.t1.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Especialidade")
public class Especialidade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "especialidade_id_seq")
    int id;
    String descricao;
}
