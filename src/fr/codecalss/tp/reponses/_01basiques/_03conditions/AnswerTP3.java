package fr.codecalss.tp.reponses._01basiques._03conditions;

//?:
public class AnswerTP3 {

    public static void main(String[] args) {

        int x=3;
        int y=129;
        int result = x*y-40;

    /*utilise ?:
        Si resultat est supérieur que 350, on imprime dans la console "yes"
        Sinon on imprime dans la console "no"
    */
        System.out.print(result>350?"yes":"no");
    }


}
