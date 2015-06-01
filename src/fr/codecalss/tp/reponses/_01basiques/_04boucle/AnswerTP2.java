package fr.codecalss.tp.reponses._01basiques._04boucle;

// avec un tableaun int
public class AnswerTP2 {

    public static void main(String[] args) {

        int[] mesResultats = {78, 90, 45, 82}; //imaginons que ce sont des résultats d'examens

        //calculter le somme de résultat avec 'for'
        int result = 0;
        for (int i=0; i < mesResultats.length; i++){
            result += mesResultats[i];
        }
        System.out.print(result);

    }
}
