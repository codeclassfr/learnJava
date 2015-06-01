package fr.codecalss.tp.reponses._04heritage;

public class Vehicule {

    private int nombreDeRoues;

    public int getNombreDeRoues() {
        return nombreDeRoues;
    }

    public void setNombreDeRoues(int nombreDeRoues) {

        this.nombreDeRoues = nombreDeRoues;
    }

    public Vehicule(int nombreDeRoues){

        this.nombreDeRoues = nombreDeRoues;
    }
}
