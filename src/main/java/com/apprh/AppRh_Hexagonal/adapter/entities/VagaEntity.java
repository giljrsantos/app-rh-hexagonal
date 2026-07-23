package com.apprh.AppRh_Hexagonal.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_vagas")
public class VagaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private BigDecimal salario;
    private Boolean status; // true = aberta; false = fechada

    @CreationTimestamp
    @Column(name = "dataCadastro", updatable = false)
    private LocalDate dataCadastro;

    @UpdateTimestamp
    @Column(name = "dataAtualizacao")
    private LocalDateTime dataAtualizacao;

}
