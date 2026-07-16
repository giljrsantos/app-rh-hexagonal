package com.apprh.AppRh_Hexagonal.core.domain;

import java.math.BigDecimal;

public class Vaga {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal salario;
    private Boolean status; // true = aberta; false = fechada
    private String dataCadastro;

    public Vaga() {
    }

    public Vaga(Long id, String nome, String descricao, BigDecimal salario, Boolean status, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
        this.status = status;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
