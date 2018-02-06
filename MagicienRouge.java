/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class MagicienRouge extends Magicien {

    public MagicienRouge() {
        pointMagie=40;
        tabSorts[0]=new Empoisonnement();
        tabSorts[1]=new MortSubite();
        nom="Magicien Rouge";
    }

}
