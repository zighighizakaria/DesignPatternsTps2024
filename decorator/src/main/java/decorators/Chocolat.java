package decorators;

import boissons.Boisson;

public class Chocolat extends DecoratorBoisson{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }


    @Override
    public String getDescription() {
        return boisson.getDescription()+" au chocolat";
    }


    @Override
    public float cout() {
        return (float) (boisson.cout()+1.5);
    }
}
