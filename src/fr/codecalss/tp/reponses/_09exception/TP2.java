package fr.codecalss.tp.reponses._09exception;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class TP2 {

    public static void main(String[] args) {

        Voiture voiture = new Voiture();


        try {
            voiture.roule();
        } catch (Exception e) {

            System.out.println(e.getMessage());

            //souvent on imprime aussi la stack trace
            e.printStackTrace();
        }
    }
}
