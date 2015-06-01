package fr.codecalss.tp.reponses._02class_attribute_methode;

public class Vehicule {

    private int nombreDeRoues;

    public void description(){
        System.out.println("Le nombre de roues de cette vehicule est " + nombreDeRoues);
    }


    public void setNombreDeRoues(int nombreDeRoues) {
        this.nombreDeRoues = nombreDeRoues;
    }

    public int getNombreDeRoues() {
        return nombreDeRoues;
    }
}
