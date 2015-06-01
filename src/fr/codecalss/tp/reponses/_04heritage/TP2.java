package fr.codecalss.tp.reponses._04heritage;

public class TP2 {

    public static void main(String[] args) {

        Voiture voiture = new Voiture();
        Moto moto = new Moto();

        System.out.println("nombre de roues de la voiture: " + voiture.getNombreDeRoues());
        System.out.println("nombre de roues de la moto: "+ moto.getNombreDeRoues());
    }
}
