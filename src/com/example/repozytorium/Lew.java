package com.example.repozytorium;

public class Lew extends LetsTry {
    int lapy;

    @Override
    public String dajGlos() {
        return "roooarrr";
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
