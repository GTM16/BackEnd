package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws Exception {
        String listaNomes = retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
        String nome = retornaIndiceAleatorio(listaNomes);

        String listaSobrenome = retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
        String sobrenome = retornaIndiceAleatorio(listaSobrenome);

        String listaPosicoes = retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");
        String posicao = retornaIndiceAleatorio(listaPosicoes);

        String listaClubes = retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
        String clube = retornaIndiceAleatorio(listaClubes);

        int idade = geraNumeroAleatorio(17, 40);

        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + " atualmente defende o " + clube);

    }

    public static int geraNumeroAleatorio(int menor, int maior) {
        int diferenca = maior - menor;
        int aleatorio = (int) Math.floor(Math.random() * diferenca);
        return aleatorio + menor + 1;
    }

    public static String retornaListaDaURI(String minhaUri) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(minhaUri)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static String retornaIndiceAleatorio(String stringao){
        String[] listaNomes = stringao.split("\n");
        int indiceAleatorio = (int) Math.floor(Math.random() * listaNomes.length);
        return listaNomes[indiceAleatorio];
    }
}