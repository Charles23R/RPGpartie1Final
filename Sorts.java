/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class Sorts {

    protected int cout;
    protected String nom;
    protected int dommage;

    public abstract void lancerSort(Personnage persoAttaque);

    public int getCout() {
        return cout;
    }

    public String getNom() {
        return nom;
    }

    public int getDommage() {
        return dommage;
    }
}
