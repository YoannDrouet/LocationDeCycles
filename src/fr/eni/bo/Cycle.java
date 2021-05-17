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
 *     <li><b>location :</b> faux si le cycle est disponible, vrai s'il est déjà loué</li>
 *     <li><b>caution :</b> la caution de location</li>
 * </ul>
 */
public abstract class Cycle {
    protected String typeCycle;
    protected String marque;
    protected String modele;
    protected LocalDate dateAchat;
    protected float tarif;
    protected boolean location;
    protected float caution;

    public Cycle(String typeCycle, String marque, String modele, LocalDate dateAchat, float tarif, float caution) {
        this.typeCycle = typeCycle;
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
        this.tarif = tarif;
        this.location = false;
        this.caution = caution;
    }

    public void afficher(){
        System.out.printf("%s %s %s (%d an) ",this.typeCycle, this.marque, this.modele, ChronoUnit.YEARS.between(dateAchat, now()));
    }

    public void location(float caution){
        if (this.location == false){
            if (verifCaution(caution)){
                System.out.println("Location ok");
                this.location = true;
            }else{
                System.err.printf("Veuillez payer la caution de %.2f€%n", this.caution);
            }
        }else {
            System.err.printf("%s indisponible%n", this.typeCycle);
        }
    }

    public boolean verifCaution(float caution){
        return (caution>=this.caution ? true : false);
    }
}
