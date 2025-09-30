package com.chell.screenmatch.service;

import com.chell.screenmatch.model.DadosSerie;


public class InicializadorAPI {
    OrganizadorAPI serie = new OrganizadorAPI();

    public void inicializador() {
        serie.pegaSerie();

        var apiDados = new ConsumoAPI();
        String dados = apiDados.obterDados(serie.getSerie(), "ac4c9a6");
        var conversor = new ConversorAPI();
        DadosSerie dadosConversor = conversor.obterDados(dados, DadosSerie.class);
        System.out.println(dadosConversor);

    }
}
