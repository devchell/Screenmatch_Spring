package com.chell.screenmatch.service;

import com.chell.screenmatch.model.DadosEpisodio;
import com.chell.screenmatch.model.DadosSerie;
import com.chell.screenmatch.model.DadosTemporada;

import java.util.Scanner;


public class InicializadorAPI {
    OrganizadorAPI serie = new OrganizadorAPI();

    public void inicializador() {
        serie.pegaDadosSerie();
        System.out.println("Deseja exibir informações de algum episódio e/ou temporada?\n" +
                "1 - Apenas a série\n" +
                "2 - Temporada\n" +
                "3 - Episódio\n" +
                "0 - Sair");
        System.out.print("Sua resposta: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        if (i == 1) {
            var apiDados = new ConsumoAPI();
            String dadosSerie = apiDados.obterDadosSerie(serie.getSerie(), "ac4c9a6");
            var conversor = new ConversorAPI();
            DadosSerie dadosConversor = conversor.obterDados(dadosSerie, DadosSerie.class);
            System.out.println(dadosConversor);
        } else if (i == 2) {
            serie.pegaDadosTemp();
            var apiDados = new ConsumoAPI();
            String dadosSerie = apiDados.obterDadosSerie(serie.getSerie(), "ac4c9a6");
            var conversor = new ConversorAPI();
            DadosSerie dadosConversor = conversor.obterDados(dadosSerie, DadosSerie.class);
            System.out.println(dadosConversor);
            String dadosTemp = apiDados.obterDadosTemp(serie.getSerie(), serie.getTemporada(),"ac4c9a6");
            DadosTemporada conversoTemp = conversor.obterDados(dadosTemp, DadosTemporada.class);
            System.out.println(conversoTemp);
        } else if (i == 3) {
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
            System.out.println("Obrigado por usar o sistema de busca do Screen Match!");
        }
    }
}
