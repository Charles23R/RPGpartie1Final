/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class PicDeGlace extends Sorts {

    public PicDeGlace(){
        cout=5;
        nom="Pic de glace";
        dommage=0;
    }

    public void lancerSort(Personnage persoAttaque){
        dommage=7-persoAttaque.getPointDef();
        persoAttaque.setPv(persoAttaque.getPv()-dommage);
        System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();
    }
}
