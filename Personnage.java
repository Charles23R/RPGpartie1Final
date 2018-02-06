/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class Personnage {

    protected int pv;
    protected int pointDef;
    protected String nom;

    protected int getPv() {
        return pv;
    }

    protected void setPv(int pv) {
        this.pv = pv;
    }

    protected int getPointDef() {
        return pointDef;
    }

    protected void setPointDef(int pointDef) {
        this.pointDef = pointDef;
    }

    protected String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected abstract void attaque(Personnage persoAttaque);

}
