package fr.codecalss.tp.reponses._01basiques._02operateur;

public class AnswerTP2 {

    public static void main(String[] args) {

        // déclarer une variable type int, name 'number1', valeur 2;
        // déclarer une variable type int, name 'number2', valeur 3;
        int number1 = 2;
        int number2 = 3;

        // imprimer dans la console number1>number2 pour voir le résultat;
        System.out.println("number1 > number2 :" + (number1 > number2));

        /* ensuite, essayez
            number1 < number2
            number1 == number2
         */

        System.out.println("number1 < number2 :" + (number1 < number2));
        System.out.println("number1 == number2 :" + (number1 == number2));
        System.out.println("number1 != number2 :" + (number1 != number2));
    }
}
