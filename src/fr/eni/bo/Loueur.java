package fr.eni.bo;

import java.time.LocalDate;

/**
 * Classe Loueur
 * <ul>
 *     <li><b>nom :</b> le nom du loueur</li>
 *     <li><b>prenom :</b> le prenom du loueur</li>
 *     <li><b>dateNaissance :</b> la date de naissance du loueur du loueur</li>
 *     <li><b>numeroTelephone :</b> le numero de telephone du loueur</li>
 *     <li><b>adresse :</b> l'adresse du loueur</li>
 * </ul>
 */
public class Loueur {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String numeroTelephone;
    private Adresse adresse;

    public Loueur(String nom, String prenom, LocalDate dateNaissance, String numeroTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
    }

    /**
     * Vérifie si le cycle est déjà loué<br>
     * Si ce n'est pas le cas, vérifie que la caution est suffisante<br>
     * Si la caution est assez élevé, change le loueur du cycle par l'instance de Loueur qui appel la méthode
     * @param cycle
     * @param caution
     */
    public void location(Cycle cycle, float caution){
        if (cycle.getLoueur() == null){
            if (verifCaution(cycle, caution)){
                System.out.println("Location ok");
                cycle.setLoueur(this);
            }else{
                System.err.printf("Veuillez payer la caution de %.2f€%n", cycle.getCaution());
            }
        }else {
            System.err.printf("%s indisponible%n", cycle.getTypeCycle().toLowerCase());
        }
    }

    /**
     * Vérifie que le vélo est bien loué et si l'instance qui le rend est bien l'instance qui l'a louer<br>
     * Si c'est bien le cas, change le loueur en null
     * @param cycle
     */
    public void rendreCycle(Cycle cycle){
        if (cycle.getLoueur() != null){
            if(cycle.getLoueur().equals(this)){
                cycle.setLoueur(null);
                System.out.printf("%s rendu !%n", cycle.getTypeCycle().toLowerCase());
            }
        }else{
            System.err.printf("Vous n'avez pas loué ce %s%n", cycle.getTypeCycle().toLowerCase());
        }
    }

    /**
     * Vérifie que la caution versée par le loueur est suffisante pour emprunter le cycle
     * @param cycle
     * @param caution
     * @return true si elle est suffisante, false sinon
     */
    public boolean verifCaution(Cycle cycle, float caution){
        return (caution>= cycle.getCaution() ? true : false);
    }
}
