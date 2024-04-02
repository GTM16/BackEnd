package org.example;

import OutrosArquivos.Jogador;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador();

        jogador.setNome(getRandomValueFromURI("https://venson.net.br/resources/data/nomes.txt"));
        jogador.setSobrenome(getRandomValueFromURI("https://venson.net.br/resources/data/sobrenomes.txt"));
        jogador.setPosicao(getRandomValueFromURI("https://venson.net.br/resources/data/posicoes.txt"));
        jogador.setClube(getRandomValueFromURI("https://venson.net.br/resources/data/clubes.txt"));
        jogador.setIdade(getRandomInt(17, 41));
        System.out.println(
                jogador.getNome() + " "
                        + jogador.getSobrenome() + " é um futebolista brasileiro de "
                        + jogador.getIdade() + " anos que atua como "
                        + jogador.getPosicao() + " atualmente defende o "
                        + jogador.getClube() + "."
        );
    }

    public static int getRandomInt(int from, int to) {
        return (int) (from + (Math.random() * (to - from)));
    }

    public static String getRandomValueFromURI(String uri) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String texto = response.body();
        String[] nomes = texto.split("\n");
        int randomIndex = (int) Math.floor(Math.random() * nomes.length);
        String nome = nomes[randomIndex];
        return nome;
    }
}


