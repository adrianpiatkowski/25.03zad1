package com.example.repozytorium;

public class Kot implements Glos {
    int liczbaNog;

    public Kot(int liczbaNog) {
        this.liczbaNog = liczbaNog;
    }

    @Override
    public void dajGlos() {
        System.out.println("meowmeow");
    }
}
