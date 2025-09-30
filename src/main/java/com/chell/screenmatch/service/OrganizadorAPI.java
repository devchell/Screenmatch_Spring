package com.chell.screenmatch.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class OrganizadorAPI {
    private String serie;

    Scanner s = new Scanner(System.in);

    public void pegaSerie() {
        System.out.print("Digite o nome da série: ");
        String serieDigitada = s.nextLine().toLowerCase();
        try {
            this.serie = URLEncoder.encode(serieDigitada, "UTF-8");
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
            this.serie = serieDigitada.replace(" ", "+");
        }
    }

    public String getSerie() {
        return serie;
    }
}
