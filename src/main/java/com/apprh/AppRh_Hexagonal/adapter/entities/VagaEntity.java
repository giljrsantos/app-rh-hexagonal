package com.apprh.AppRh_Hexagonal.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_vaga")
public class VagaEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal salario;
    private Boolean status; // true = aberta; false = fechada
    private String dataCadastro;

}
