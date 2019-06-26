package com.example.cardapio.models;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Gerador {
    private String tipo;
    private int quantidade;
    private List<Pratos> fakes;

    public Gerador(String tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public List<Pratos> gerarFakes() {
        Faker faker = new Faker(new Locale("pt-Br"));
        fakes = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            switch (tipo){
                case "Carne":
                    Pratos pratos = new Pratos(faker.name().fullName(), "Carne"); //Instanciar separado
                    fakes.add(pratos);
                    break;
                case "Peixe": fakes.add (new Pratos(faker.pokemon().name(), "Peixe")); //Instanciar junto
                    break;
                case "Frango": fakes.add (new Pratos (faker.address().fullAddress(), "Frango"));
                    break;
                case "Massa": fakes.add (new Pratos (faker.artist().name(),"Massa"));
                    break;
                case "Sushi": fakes.add (new Pratos (faker.beer().name(), "Sushi"));
                    break;
            }
        }
        return fakes;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public List<Pratos> getFakes() {
        return fakes;
    }
}