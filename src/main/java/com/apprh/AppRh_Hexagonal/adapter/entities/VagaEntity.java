package com.apprh.AppRh_Hexagonal.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_vaga")
public class VagaEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private BigDecimal salario;
    private Boolean status; // true = aberta; false = fechada

    @CreationTimestamp
    @Column(name = "dataCadastro", updatable = false)
    private LocalDate dataCadastro;

    @CreationTimestamp
    @Column(name = "dataAtualizacao")
    private LocalDate dataAtualizacao;

}
