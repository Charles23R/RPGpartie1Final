/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class Empoisonnement extends Sorts {

    int nbTour=0;

    public Empoisonnement(){
        cout=2;
        nom="Empoisonnement";
        dommage=0;
    }

    public void lancerSort(Personnage persoAttaque){
        dommage=(2+(nbTour*2));
        persoAttaque.setPv(persoAttaque.getPv()-dommage);
        nbTour++;
        System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();
    }
}
