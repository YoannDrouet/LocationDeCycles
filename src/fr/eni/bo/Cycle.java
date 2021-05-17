package fr.eni.bo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.*;

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

    public void afficher(){
        System.out.printf("%s %s %s (%d an) ",this.typeCycle, this.marque, this.modele, ChronoUnit.YEARS.between(dateAchat, now()));
    }
}
