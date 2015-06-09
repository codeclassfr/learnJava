package fr.codecalss.tp.reponses._09exception;


/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class Voiture {

    public void roule() throws Exception {

        System.out.println("La voiture est en train de rouler!");

        throw new Exception("Une panne de voiture!");
    }
}
