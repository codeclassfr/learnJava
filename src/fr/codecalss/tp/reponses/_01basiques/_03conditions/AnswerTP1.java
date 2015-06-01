package fr.codecalss.tp.reponses._01basiques._03conditions;

public class AnswerTP1 {

    public static void main(String[] args) {

        boolean result = 18%5>4;

        // si result == true, on imprime dans la console "bonjour"

        if(result){
            System.out.print("bonjour");
        }
        // sinon, on imprime dans la console "au revoir"
        else {
            System.out.print("au revoir");
        }

    }
}
