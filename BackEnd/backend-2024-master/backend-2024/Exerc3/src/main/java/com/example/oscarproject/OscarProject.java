package com.example.oscarproject;

import com.example.oscarproject.domain.Ator;
import com.example.oscarproject.domain.Filme;
import com.example.oscarproject.service.OscarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OscarProject{

    public static void main(String[] args) {
        SpringApplication.run(OscarProject.class, args);

        var oscarService = new OscarService();

        var filme = new Filme("Gente Grande", "Comédia");
        var ator = new Ator("Adan Sandler", "Americano");

        oscarService.adicionarIndicacao(filme, "Oscar Filme");
        oscarService.adicionarIndicacao(ator, "Oscar Ator");

        oscarService.mostrarListaIndicacoes();
    }
}
