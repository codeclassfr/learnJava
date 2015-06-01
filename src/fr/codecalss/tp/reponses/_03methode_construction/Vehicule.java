package fr.codecalss.tp.reponses._03methode_construction;

public class Vehicule {

    private int nombreDeRoues;

    public Vehicule(int nombreDeRoues){

        this.nombreDeRoues = nombreDeRoues;
    }

    public Vehicule(){

        this.nombreDeRoues = 4;
    }

    public int getNombreDeRoues() {
        return nombreDeRoues;
    }
}
