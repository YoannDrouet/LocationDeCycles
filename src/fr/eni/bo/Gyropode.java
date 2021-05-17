package fr.eni.bo;

import java.time.LocalDate;

/**
 * Classe Gyropode hériant de la classe CycleElectrique
 * <ul>
 *     <li><b>tailleMin :</b> la taille minimum (en cm) pour utiliser ce gyropode</li>
 *     <li><b>tarifGyroropode :</b> le tarif de location du gyroropode</li>
 * </ul>
 */
public class Gyropode extends CycleElectrique {

    private short tailleMin;
    private static final float tarifGyropode = (float)29.9;

    public Gyropode(String marque, String modele, LocalDate dateAchat, short autonomie, short tailleMin) {
        super("Gyroropode", marque, modele, dateAchat, tarifGyropode, autonomie);
        this.tailleMin = tailleMin;
    }

    @Override
    public void afficher() {
        super.afficher();
        formatageTaille();
        System.out.printf(" %.2f€/heure%n", this.tarif);
    }

    /**
     * Permet de renvoyer un affichage formater de la taille sous forme d'une chaîne de caractère
     */
    private void formatageTaille() {
        if (tailleMin >= 100){
            System.out.printf("[1m%d min]", this.tailleMin-100);
        }else {
            System.out.printf("[0m%d min]", this.tailleMin-100);
        }
    }
}
