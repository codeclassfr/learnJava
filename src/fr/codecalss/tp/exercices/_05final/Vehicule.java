package fr.codecalss.tp.exercices._05final;

/**
 * Created by codeclass.fr on 09/06/2015.
 */
public class Vehicule {

    public String VTYPE="voiture";

    public final void logInfo(String vtype){

        this.VTYPE = vtype;
        System.out.print(vtype);
    }

}
