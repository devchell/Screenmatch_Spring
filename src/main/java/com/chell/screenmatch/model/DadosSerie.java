package com.chell.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer temporada,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("imdbVotes") String votos,
                         @JsonAlias("Released") String lancamento,
                         @JsonAlias("Actors") String atores) {

    @Override
    public String toString(){
        return "\n\n=-=-=-=-=-=-=-= Informações da Série =-=-=-=-=-=-=-=\n\n" +
                "Título: " + titulo +
                "\nTemporadas: " + temporada +
                "\nAvaliação: " + avaliacao + " estrelas | " + votos + " votos" +
                "\nAno de lançamento: " + lancamento +
                "\nAtores principais: " + atores + "\n" +
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    }
}
