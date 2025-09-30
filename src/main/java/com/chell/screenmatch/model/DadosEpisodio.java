package com.chell.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Season") Integer temporada,
                            @JsonAlias("Episode") Integer episodio,
                            @JsonAlias("Released") String lancamento,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("imdbVotes") String votos,
                            @JsonAlias("Runtime") String tempo) {
    @Override
    public String toString(){
        return "\n=-=-=-=-=-=-=-= Informações do episódio =-=-=-=-=-=-=-=\n\n" +
                "Título: " + titulo +
                "\nEpisódio: " + episodio + " | Tempo: " + tempo + " | Temporada: " + temporada +
                "\nAvaliação: " + avaliacao + " estrelas | " + votos + " votos" +
                "\nData de lançamento: " + lancamento;
    }
}
