package com.chell.screenmatch.main;


import com.chell.screenmatch.service.InicializadorAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main implements CommandLineRunner {
    static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        InicializadorAPI inicia = new InicializadorAPI();
        inicia.inicializador();
    }
}
