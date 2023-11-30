package boissons;

public class Expresso extends Boisson{


    public Expresso() {
        description="Expresso";
    }

    @Override
    public float cout() {
        return 12;
    }
}
