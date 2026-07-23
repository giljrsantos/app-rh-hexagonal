package com.apprh.AppRh_Hexagonal.core.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vaga {

    private Long id;
    private String titulo;
    private String descricao;
    private BigDecimal salario;
    private Boolean status; // true = aberta; false = fechada
    private LocalDate dataCadastro;
    private LocalDateTime dataAtualizacao;

    public Vaga() {
    }

    public Vaga(Long id, String titulo, String descricao, BigDecimal salario, Boolean status, LocalDate dataCadastro, LocalDateTime dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.salario = salario;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
