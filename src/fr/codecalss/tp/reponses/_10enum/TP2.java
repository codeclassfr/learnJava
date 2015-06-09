package fr.codecalss.tp.reponses._10enum;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class TP2 {

    public static void main(String[] args) {

        //Imprime toutes les valeurs d'enum Color
        Color[] colors = Color.values();

        for (Color color : colors){
            System.out.println(color);
        }


    }
}
