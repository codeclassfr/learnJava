package fr.codecalss.tp.reponses._03methode_construction;

public class TP2 {

    public static void main(String[] args) {

        Vehicule vehicule1 = new Vehicule(2);
        Vehicule vehicule2 = new Vehicule();

        System.out.println("Le nombre de roues du premier vehicule : " + vehicule1.getNombreDeRoues());
        System.out.println("Le nombre de roues du deuxième vehicule : "+ vehicule2.getNombreDeRoues());

    }
}
