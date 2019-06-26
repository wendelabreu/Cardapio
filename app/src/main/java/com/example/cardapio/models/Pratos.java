package com.example.cardapio.models;

import com.example.cardapio.R;

public class Pratos {
    private String nome;
    private String tipo;
    private int foto;

    public Pratos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
    public int getFoto() {
        switch (tipo){
            case "Carne":
                foto = R.drawable.carne;
                break;
            case "Peixe":
                foto = R.drawable.peixe;
                break;
            case "Frango":
                foto = R.drawable.frango;
                break;
            case "Massa":
                foto = R.drawable.massa;
                break;
            case "Sushi":
                foto = R.drawable.sushi;
                break;

        }
        return foto;
    }
}
