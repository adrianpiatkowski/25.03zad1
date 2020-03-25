package com.example.repozytorium;

public class Kot extends LetsTry {
    int lapyyy = 4;

    @Override
    public String dajGlos() {
        return "meowmewo";
    }

    @Override
    public Integer iloscLap() {
        return lapyyy;
    }

    @Override
    public void setIloscNog2(Integer iloscNog2) {
        super.setIloscNog2(iloscNog2);
        lapyyy = iloscNog2;
    }

}
