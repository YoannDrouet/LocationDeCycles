package fr.eni;

import java.time.LocalDate;

/**
 * Classe Velo héritant de la classe Cycle
 * <ul>
 *     <li><b>vitesse :</b> le nombre de vitesse que possède le vélo</li>
 *     <li><b>tarifVelo :</b> le tarif de location du vélo</li>
 * </ul>
 */
public class Velo extends Cycle {

    private byte vitesses;
    private static final float tarifVelo = (float)4.9;

    public Velo(String marque, String modele, LocalDate dateAchat, byte vitesses) {
        super("Vélo", marque, modele, dateAchat, tarifVelo);
        this.vitesses = vitesses;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf("%d vitesses %.2f€/heure", this.vitesses, this.tarif);
    }
}
