package fr.codecalss.tp.reponses._02class_attribute_methode;

public class TP2 {

    public static void main(String[] args) {

        Vehicule vehicule1 = new Vehicule();
        vehicule1.setNombreDeRoues(2);

        Vehicule vehicule2 = new Vehicule();
        vehicule2.setNombreDeRoues(3);

        Vehicule vehicule3 = new Vehicule();
        vehicule3.setNombreDeRoues(4);

        Vehicule[] mesVehicules = {vehicule1,vehicule2,vehicule3};

        int nombreDeRoueEnTotal = 0;

        for (Vehicule vehicule : mesVehicules){
            nombreDeRoueEnTotal += vehicule.getNombreDeRoues();
        }

        System.out.println("On a en total " + nombreDeRoueEnTotal + " roues");
    }
}
