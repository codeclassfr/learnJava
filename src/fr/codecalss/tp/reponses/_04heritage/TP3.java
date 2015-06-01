package fr.codecalss.tp.reponses._04heritage;

public class TP3 {

    public static void main(String[] args) {

        Voiture voiture1 = new Voiture();

        Voiture voiture2 = new Voiture();

        Moto moto = new Moto();

        voiture1.setNombreDeRoues(6);

        Vehicule[] mesVehicules = {voiture1,voiture2,moto};

        int nombreDeRouesEnTotal = 0;

        for(Vehicule vehicule: mesVehicules){
            nombreDeRouesEnTotal += vehicule.getNombreDeRoues();
        }

        System.out.println("Nombre de roues en total de mes vehicules :" + nombreDeRouesEnTotal);
    }


}
