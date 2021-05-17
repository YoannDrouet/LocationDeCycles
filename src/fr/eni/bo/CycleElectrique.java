package fr.eni.bo;

import java.time.LocalDate;

/**
 * Classe CycleElectrique héritant de la classe Cycle
 * <ul>
 *     <li><b>autonomie :</b> le nombre de kilomètre d'autonomie du cycle électrique</li>
 * </ul>
 */
public abstract class CycleElectrique extends Cycle{
    protected short autonomie;

    public CycleElectrique(String typeCycle, String marque, String modele, LocalDate dateAchat, float tarif, short autonomie) {
        super(typeCycle, marque, modele, dateAchat, tarif);
        this.autonomie = autonomie;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf("%d km d'autonomie ", this.autonomie);
    }
}
