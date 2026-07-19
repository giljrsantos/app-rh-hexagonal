package com.apprh.AppRh_Hexagonal.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VagaDto {

    private Long id;
    private String descricao;
    private BigDecimal salario;
    private Boolean status; // true = aberta; false = fechada
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

}
