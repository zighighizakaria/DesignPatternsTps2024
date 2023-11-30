package org.example;

import org.example.compo.Component;
import org.example.compo.Folder;

public class Main {
    public static void main(String[] args) {

        Folder root=new Folder("Design Patterns");
        Folder d1=(Folder) root.addComponent(new Folder("Component"));
        Folder d2=(Folder)root.addComponent(new Folder("Structure"));
        Folder d3=(Folder)root.addComponent(new Folder("Création"));
        root.show();


    }
}