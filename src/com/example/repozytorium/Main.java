package com.example.repozytorium;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {

    public static void main(String[] args) {

//        ArrayList<Glos> zwierzeta = new ArrayList();
//        Kot kot1 = new Kot(3);
//
//        Pies pies1 = new Pies(27);
//        zwierzeta.add(kot1);
//        zwierzeta.add(pies1);
//        zwierzeta.stream().forEach(Glos::dajGlos);

        Lew lew = new Lew();
        Losoś losoś = new Losoś();
        Słoń słoń = new Słoń();
        ArrayList<Animal> zwierzaki = new ArrayList();

        zwierzaki.add(lew);
        zwierzaki.add(losoś);
        zwierzaki.add(słoń);


        Kot kot17 = new Kot();

        kot17.setIloscNog2(17);

        zwierzaki.add(kot17);

        Kot zwyklak = new Kot();
        zwierzaki.add(zwyklak);
        zwierzaki.stream().forEach(Animal-> System.out.println("Zwierze posiada " + Animal.iloscLap()+ " łap, " + "wydaje dźwięk: " + Animal.dajGlos()));
    }
}
