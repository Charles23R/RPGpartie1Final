/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class BouleDeFeu extends Sorts {

    public BouleDeFeu(){
        cout=5;
        nom="Boule de feu";
        dommage=5;
    }


    public void lancerSort(Personnage persoAttaque) {
        persoAttaque.setPv(persoAttaque.getPv()-5);
        System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();
    }
}
