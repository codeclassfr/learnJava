package fr.codecalss.tp.reponses._07interface;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class Voiture implements IVehicule {

    private float price;

    @Override
    public float getPrice() {
        return this.price;
    }
}
