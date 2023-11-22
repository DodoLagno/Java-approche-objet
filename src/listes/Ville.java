package listes;

import java.util.Objects;

public class Ville {
    private String nom;
    private int nombreHabitants;

    // Constructeur
    public Ville(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Les deux références pointent vers le même objet
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Les classes des objets sont différentes
        }

        Ville autreVille = (Ville) obj;
        return nombreHabitants == autreVille.nombreHabitants && Objects.equals(nom, autreVille.nom);
    }

    // Redéfinition de la méthode hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nom, nombreHabitants);
    }

    // Méthode pour comparer avec l'opérateur ==
    public boolean isEqualTo(Ville autreVille) {
        return this == autreVille;
    }

    // Redéfinition de la méthode toString pour une représentation textuelle
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nombreHabitants=" + nombreHabitants +
                '}';
    }
}
