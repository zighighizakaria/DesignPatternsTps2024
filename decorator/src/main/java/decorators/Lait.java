package decorators;

import boissons.Boisson;

public class Lait extends DecoratorBoisson{

    public Lait(Boisson boisson) {
        super(boisson);
    }


    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait";
    }


    @Override
    public float cout() {
        return boisson.cout()+1;
    }
}
