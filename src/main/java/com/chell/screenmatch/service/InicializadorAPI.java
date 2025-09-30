package com.chell.screenmatch.service;

import com.chell.screenmatch.model.DadosEpisodio;
import com.chell.screenmatch.model.DadosSerie;

import java.util.Scanner;


public class InicializadorAPI {
    OrganizadorAPI serie = new OrganizadorAPI();

    public void inicializador() {
        serie.pegaDadosSerie();
        System.out.println("Deseja exibir informações de algum episódio? (1 = Sim | 0 = Não)");
        System.out.print("Sua resposta: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();


        if (i == 1) {
            serie.pegaDadosEp();
            var apiDados = new ConsumoAPI();
            String dadosSerie = apiDados.obterDadosSerie(serie.getSerie(), "ac4c9a6");
            var conversor = new ConversorAPI();
            DadosSerie dadosConversor = conversor.obterDados(dadosSerie, DadosSerie.class);
            System.out.println(dadosConversor);
            String dadosEp = apiDados.obterDadosEp(serie.getSerie(), serie.getTemporada(), serie.getEpisodio(), "ac4c9a6");
            DadosEpisodio conversoEp = conversor.obterDados(dadosEp, DadosEpisodio.class);
            System.out.println(conversoEp);
        } else {
            var apiDados = new ConsumoAPI();
            String dadosSerie = apiDados.obterDadosSerie(serie.getSerie(), "ac4c9a6");
            var conversor = new ConversorAPI();
            DadosSerie dadosConversor = conversor.obterDados(dadosSerie, DadosSerie.class);
            System.out.println(dadosConversor);
        }
    }
}
