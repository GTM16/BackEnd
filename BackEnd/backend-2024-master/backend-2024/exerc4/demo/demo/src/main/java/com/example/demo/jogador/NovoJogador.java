package com.example.demo.jogador;

public class NovoJogador {
    public static void NewJogador(String[] args) throws Exception {
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

    private static int getRandomInt(int i, int i1) {
        return i;
    }

    private static String getRandomValueFromURI(String url) {
        return null;
    }
}
