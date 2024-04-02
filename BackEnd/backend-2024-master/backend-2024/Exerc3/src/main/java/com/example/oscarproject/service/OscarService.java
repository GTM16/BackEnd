package com.example.oscarproject.service;

import com.example.oscarproject.domain.Ator;
import com.example.oscarproject.domain.Filme;
import com.example.oscarproject.domain.Indicacao;
import com.example.oscarproject.domain.Indicavel;

import java.util.ArrayList;
import java.util.List;

public class OscarService {
    private List<Indicacao> indicacoes = new ArrayList<>();

    public void adicionarIndicacao(Indicavel indicavel, String categoria) {
        indicavel.indicar();
        indicacoes.add(new Indicacao(indicavel, categoria));
    }

    public void mostrarListaIndicacoes() {
        indicacoes.forEach(indicacao -> {
            System.out.println(retornaTextoIndicacao(indicacao));
        });
    }

    private String retornaTextoIndicacao(Indicacao indicacao) {
        Indicavel indicavel = indicacao.getIndicavel();
        String tipo = indicavel instanceof Ator ? "Ator" : "Filme";
        String nome = tipo.equals("Ator") ? ((Ator) indicavel).getNome() : ((Filme) indicavel).getNome();
        String categoria = indicacao.getCategoria();
        int numeroDeIndicacoes = tipo.equals("Ator") ? ((Ator) indicavel).getNumeroDeIndicacoes() : ((Filme) indicavel).getNumeroDeIndicacoes();

        return tipo + ": " + nome + ", Categoria: " + categoria + ", Número de Indicações: " + numeroDeIndicacoes;
    }
}
