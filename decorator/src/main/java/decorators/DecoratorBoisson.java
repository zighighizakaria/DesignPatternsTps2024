package decorators;

import boissons.Boisson;

public abstract class DecoratorBoisson extends Boisson {

    public DecoratorBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    protected Boisson boisson;


    public abstract String getDescription();
    public abstract float cout();


}
