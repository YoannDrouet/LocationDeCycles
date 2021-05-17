package fr.eni;

import java.time.LocalDate;

/**
 * Classe abstraite Cycle<br>
 * <ul>
 *     <li><b>typeCyle :</b> s'agit-il d'un vélo, gyroroue, gyropode, ...</li>
 *     <li><b>marque :</b> la marque du cycle</li>
 *     <li><b>modele :</b> la modèle du cycle</li>
 *     <li><b>dateAchat :</b> la date à laquelle le cycle à été acheté</li>
 *     <li><b>tarif :</b> le tarif de location du cycle</li>
 * </ul>
 */
public abstract class Cycle {
    protected String typeCycle;
    protected String marque;
    protected String modele;
    protected LocalDate dateAchat;
    protected float tarif;

    public Cycle(String typeCycle, String marque, String modele, LocalDate dateAchat, float tarif) {
        this.typeCycle = typeCycle;
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
        this.tarif = tarif;
    }

    /**
     * Permet de calculer depuis combien de temps le cycle à été acheté
     * @return le nombre d'année depuis la date d'achat
     */
    public int acheterDepuis(){
        return LocalDate.now().getYear()-dateAchat.getYear();
    }

    public void afficher(){
        System.out.printf("%s %s %s (%d) ",this.typeCycle, this.marque, this.modele, acheterDepuis());
    }
}
