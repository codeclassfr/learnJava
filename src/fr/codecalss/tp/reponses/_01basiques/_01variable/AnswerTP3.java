package fr.codecalss.tp.reponses._01basiques._01variable;

public class AnswerTP3 {

    public static void main(String[] args) {

        // Déclarer un tableau de String, avec 'nomsDesCours' comme nom de variable, valeurs : "Java", "Android", "Git"
        String[] nomsDesCours = {"Java", "Android", "Git"};

        // imprimer dans la console le résultat de nomDesCours[0]+nomDesCours[1]+nomDesCours[2]
        System.out.println(nomsDesCours[0] + nomsDesCours[1] + nomsDesCours[2]);

        // changer le valeur de 1er élément de tableau à la valeur "Php";
        nomsDesCours[0] = "Php";


        // imprimer dans la console la valeur de 1er élément
        System.out.print(nomsDesCours[0] );

    }
}