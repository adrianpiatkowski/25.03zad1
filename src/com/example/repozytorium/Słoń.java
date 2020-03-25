package com.example.repozytorium;

public class Słoń extends LetsTry {
    int lapy;

    @Override
    public String dajGlos() {
        return "Luuuuuuuu";
    }

    @Override
    public Integer iloscLap() {
        return lapy;
    }

    @Override
    public void setIloscNog2(Integer iloscNog2) {
        super.setIloscNog2(iloscNog2);
        lapy = iloscNog2;
    }
}
