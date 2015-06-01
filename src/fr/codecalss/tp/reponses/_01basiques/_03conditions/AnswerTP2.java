package fr.codecalss.tp.reponses._01basiques._03conditions;

// switch
public class AnswerTP2 {

    public static void main(String[] args) {
        int i = 12;
        i++;
        int j = 1;
        j+=2;
        int result = i%j;

        /* utilise switch,
            si result égale à 1, imprime dans la console "result==1",
            si result égale à 2, imprime dans la console "result==2"
            et on prepare un cas par défaut: "unknown result"
        */
        switch (result){
            case 1: System.out.print("result==1");break;
            case 2: System.out.print("result==2");break;
            default:System.out.print("result ");
        }

    }
}
