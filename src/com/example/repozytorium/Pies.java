package com.example.repozytorium;

public class Pies implements Glos {

    int liczbaZebow;

    public Pies(int liczbaZebow) {
        this.liczbaZebow = liczbaZebow;
    }

    @Override
    public void dajGlos() {
        System.out.println("hauhau");
    }
}
