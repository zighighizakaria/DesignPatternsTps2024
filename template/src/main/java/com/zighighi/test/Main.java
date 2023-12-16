package com.zighighi.test;

import com.zighighi.util.Utilitaire;
import com.zighighi.util.UtilitaireImpl1;
import com.zighighi.util.UtilitaireImpl2;

public class Main {
    public static void main(String[] args) {
        Utilitaire utilitaire = new UtilitaireImpl1();
        System.out.println(utilitaire.compute("azerty"));
        utilitaire = new UtilitaireImpl2();
        System.out.println(utilitaire.compute("azerty"));

    }
}
