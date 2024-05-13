package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pesssoa {
    private String nome;
    private LocalDate nascimento;

    public Pesssoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean maiorIdade() {
        return getIdade() >= 18;
    }
}