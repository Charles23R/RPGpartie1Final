/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class Guerrier extends Personnage {

    protected int pointForce;

    public void attaque(Personnage persoAttaque){
        int degat;

        System.out.println("Le "+getNom()+" attaque!");

        degat=(pointForce*2-persoAttaque.getPointDef());
        persoAttaque.setPv(persoAttaque.getPv()-degat);

        System.out.println("Le "+persoAttaque.getNom()+" perds "+degat+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();

    }

}
