import java.util.Scanner;

/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class Main {
    public static void main(String[] args) {


        //Variables
        Scanner sc=new Scanner(System.in);
        int choix;
        boolean erreur=true;
        Personnage perso1=null;
        Personnage perso2=null;
        int tour=0;

        //Choix des personnages
        while (erreur) {
            System.out.println("Choisissez le type du premier combattant");
            System.out.println("1-Barbare");
            System.out.println("2-Paladin");
            System.out.println("3-Magicien Rouge");
            System.out.println("4-Magicien Noir");

            choix = sc.nextInt();

                switch (choix){
                    case 1: perso1=new Barbare();
                        erreur=false;
                    break;

                    case 2: perso1=new Paladin();
                        erreur=false;
                    break;

                    case 3: perso1=new MagicienRouge();
                        erreur=false;
                    break;

                    case 4: perso1=new MagicienNoir();
                    erreur=false;
                    break;

                    default:System.out.println("Entrez un nombre valide");

            }
        }

        erreur=true;
        while (erreur) {
            System.out.println("Choisissez le type du deuxième combattant");
            System.out.println("1-Barbare");
            System.out.println("2-Paladin");
            System.out.println("3-Magicien Rouge");
            System.out.println("4-Magicien Noir");

            choix = sc.nextInt();

            switch (choix){
                case 1: perso2=new Barbare();
                    erreur=false;
                    break;

                case 2: perso2=new Paladin();
                    erreur=false;
                    break;

                case 3: perso2=new MagicienRouge();
                    erreur=false;
                    break;

                case 4: perso2=new MagicienNoir();
                    erreur=false;
                    break;

                default:System.out.println("Entrez un nombre valide");

            }
        }

        sc.close();

        //Combat
        while (perso1.getPv()>0 && perso2.getPv()>0 && !erreur){
            tour++;

            if (tour%2==1){
                perso1.attaque(perso2);
            }
            else{
                perso2.attaque(perso1);
            }
            if (perso1 instanceof Magicien && perso2 instanceof Magicien){
                if (((Magicien) perso1).getPointMagie()<=2 || ((Magicien) perso2).getPointMagie()<=2){
                    erreur=true;
                }
            }
}

        //Fin de la partie
        if (perso1.getPv()<=0){
            System.out.println("Le "+perso2.getNom()+" a gagné!");
        }
        else if (erreur){
            System.out.println("Match nul");
        }
        else{
            System.out.println("Le "+perso1.getNom()+" a gagné!");
        }

        }
    }

