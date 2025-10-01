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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Título: ").append(titulo);

        if (episodio != null) {
            sb.append("\nEpisódio: ").append(episodio);
        }
        if (tempo != null) {
            sb.append(" | Tempo: ").append(tempo);
        }
        if (temporada != null) {
            sb.append(" | Temporada: ").append(temporada);
        }

        if (avaliacao != null) {
            sb.append("\nAvaliação: ").append(avaliacao).append(" estrelas");
        }
        if (votos != null) {
            sb.append(" | ").append(votos).append(" votos");
        }
        sb.append("\nData de lançamento: ").append(lancamento != null ? lancamento : "N/A");
        sb.append("\n---------------------------------------------------------------------");
        return sb.toString();
    }
}
