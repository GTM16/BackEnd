package com.example.oscarproject.domain;

public class Filme implements Indicavel {
    private String nome;
    private String genero;
    private int numeroDeIndicacoes;

    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public void indicar() {
        this.numeroDeIndicacoes++;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }
}
