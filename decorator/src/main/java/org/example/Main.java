package org.example;

import boissons.Boisson;
import boissons.Expresso;
import boissons.Sumatra;
import decorators.Chocolat;
import decorators.Lait;

public class Main {
    public static void main(String[] args) {

        Boisson b = new Lait(new Lait(new Lait(new Lait(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("------------------------------");

        Boisson c = new Expresso();
        c = new Lait(new Chocolat(new Chocolat(c)));
        System.out.println(c.getDescription());
        System.out.println(c.cout());
        System.out.println("------------------------------");




    }
}