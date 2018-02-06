/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class MortSubite extends Sorts {
    public MortSubite() {
        cout=10;
        nom="Mort subite";
        dommage=10000;
    }

    public void lancerSort(Personnage persoAttaque){
        int random=(int)((Math.random()*10)+1);
        if (random==1){
            persoAttaque.setPv(0);
            System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
            System.out.println();
            System.out.println();
        }
        else {
            System.out.println("L'attaque a échouée.");
            System.out.println();
            System.out.println();
        }
    }
}
