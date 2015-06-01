package fr.codecalss.tp.reponses._01basiques._04boucle;

//while, for
public class AnswerTP1 {

    public static void main(String[] args) {

        //imprime l somme de 1 à 100 en utilisant 'while'
        int i=1;
        int result = 0;
        while (i<=100){
            result += i;
            i++;
        }
        System.out.println("(while) result :" + result);


        //imprime la somme de 1 à 100 en utilisant 'for'
        result = 0;
        for (int j=1; j<=100; j++){
            result +=j;
        }
        System.out.print("(for) result :" + result);


    }
}
