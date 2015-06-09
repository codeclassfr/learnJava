package fr.codecalss.tp.reponses._12map;

import fr.codecalss.tp.reponses._10enum.Color;
import fr.codecalss.tp.reponses._11list.Voiture;

import java.util.*;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class TP1 {

    public static void main(String[] args) {


        String [] proprietaires = {"Jacques","Albert",
                "Théodore","Lucien","Odette","Émile","Marcel","René","Pierre","Jean"};

        // Créer un map<String,Voiture>. Alimentez-le avec la clé (un élément dans proprietaires),
        // et 10 voitures générées aléatoirement comme dans l'exercice _11list

        Map<String, Voiture> voitures = new HashMap<String, Voiture>();
        Random random = new Random();
        for (int i=0; i<10; i++){
            Voiture voiture = new Voiture();
            voiture.setId(""+i);
            voiture.setColor(Color.values()[random.nextInt(3)]);
            voitures.put(proprietaires[i],voiture);
        }

        // imprime toutes les clés du map, imprime toutes les valeurs du map

        for (String key: voitures.keySet()){
            Voiture voiture = voitures.get(key);
            System.out.println(key + "=> voiture:"+ voiture.getId()+" "+voiture.getColor());

        }

    }
}
