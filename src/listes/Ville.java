package listes;

public class Ville {
    private String nom;
    private final int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return "Ville{nom='" + nom + '\'' + ", nbHabitants=" + nbHabitants + '}';
    }
}
