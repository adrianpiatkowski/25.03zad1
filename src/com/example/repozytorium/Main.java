package com.example.repozytorium;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

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
        ArrayList<Łapy> zwierzaki = new ArrayList();

        zwierzaki.add(lew);
        zwierzaki.add(losoś);
        zwierzaki.add(słoń);
        zwierzaki.stream().forEach(Łapy-> System.out.println(Łapy.iloscLap()));
    }
}
