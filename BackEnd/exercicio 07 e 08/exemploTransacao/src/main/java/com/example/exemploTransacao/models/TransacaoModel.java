package com.example.exemploTransacao.models;

public class TransacaoModel {
    private String recebedor;
    private String pagador;
    private Double quantidade;

    public TransacaoModel(String recebedor, String pagador, Double quantidade) {
        this.recebedor = recebedor;
        this.pagador = pagador;
        this.quantidade = quantidade;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}

