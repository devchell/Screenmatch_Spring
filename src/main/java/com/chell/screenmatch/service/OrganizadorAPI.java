package com.chell.screenmatch.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class OrganizadorAPI {
    private String serie;
    private int episodio;
    private int temporada;

    Scanner s = new Scanner(System.in);

    public void pegaDadosSerie() {
        System.out.print("Digite o nome da série: ");
        String serieDigitada = s.nextLine().toLowerCase();
        try {
            this.serie = URLEncoder.encode(serieDigitada, "UTF-8");
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
            this.serie = serieDigitada.replace(" ", "+");
        }
    }

    public void pegaDadosEp() {
        this.temporada = lerNumero("Digite a temporada: ");
        this.episodio = lerNumero("Digite o episódio: ");
    }

    private int lerNumero(String mensagem) {
        int numero = -1;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensagem);
            try {
                numero = Integer.parseInt(s.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("\nOps, não consegui entender essa informação, digite novamnete!");
            }
        }
        return numero;
    }

    public String getSerie() {
        return serie;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getEpisodio() {
        return episodio;
    }
}
