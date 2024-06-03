package com.example.oscarproject.domain;

public class Ator implements Indicavel {
    private String nome;
    private String nacionalidade;
    private int numeroDeIndicacoes;

    public Ator(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public void indicar() {
        this.numeroDeIndicacoes++;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }
}
