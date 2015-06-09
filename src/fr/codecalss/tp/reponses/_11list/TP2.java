package fr.codecalss.tp.reponses._11list;

import fr.codecalss.tp.reponses._10enum.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class TP2 {

    public static void main(String[] args) {

        //construisez une liste de 10 voitures.
        // (id de 0 à 9, color aléalotire parmi les 3 couleurs définies dans enum Color de exercice _10enum)
        List<Voiture> voitures = new ArrayList<Voiture>();

        Color[] colors = Color.values();

        Random rand = new Random(); // générateur d'un int

        for (int i=0; i<10; i++){
            Voiture voiture = new Voiture();
            voiture.setId(""+i);
            int randomNumber = rand.nextInt(3);
            voiture.setColor(colors[randomNumber]);

            System.out.println("Voiture["+voiture.getId()+"]: "+voiture.getColor());

            voitures.add(voiture);
        }



        //imprime le nombre total de voitures en couleur red?
        int totalNumbreVoituresRouges = 0;
        for (Voiture voiture : voitures){
            if(Color.red.equals(voiture.getColor())){
                totalNumbreVoituresRouges ++;
            }
        }

        System.out.println("Le nombre de voitures rouges: "+ totalNumbreVoituresRouges);

    }
}
