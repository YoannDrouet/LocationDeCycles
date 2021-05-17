package fr.eni.bo;

import java.time.LocalDate;

/**
 * Classe Gyroroue héritant de la classe CycleElectrique
 * <ul>
 *     <li><b>tarifGyroroue :</b> le tarif de location du gyroroue</li>
 *     <li><b>cautionGyroroue :</b> la caution à payer pour louer la gyroroue</li>
 * </ul>
 */
public class Gyroroue extends CycleElectrique{

    private static final float tarifGyroroue = (float)18.9;
    private static final float cautionGyroroue = (float)250;

    public Gyroroue(String marque, String modele, LocalDate dateAchat, short autonomie) {
        super("Gyroroue", marque, modele, dateAchat, tarifGyroroue, cautionGyroroue, autonomie);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf(" %.2f€/heure%n", this.tarif);
    }
}
