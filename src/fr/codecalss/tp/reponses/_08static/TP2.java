package fr.codecalss.tp.reponses._08static;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class TP2 {

    public static void main(String[] args) {
        //essayez appeler la méthode logInfo
        Voiture.logInfo();


        // créez une instance Voiture. Essaye si on peut appeler la méthode logInfo avec l'instance voiture

        Voiture voiture = new Voiture();
        voiture.logInfo();
        //c'est possible, mais c'est déconseillé par compilateur
    }
}
