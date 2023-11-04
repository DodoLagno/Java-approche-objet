package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse = new AdressePostale(123, "Rue de la Ville", 75001, "Paris");
        Personne personne = new Personne("Doe", "John", adresse);

        // Utilisation de la méthode pour afficher le nom et prénom en majuscules
        personne.afficherNomPrenomMajuscules();

        // Utilisation de la méthode pour modifier le nom
        personne.modifierNom("Smith");

        // Utilisation de la méthode pour modifier l'adresse
        AdressePostale nouvelleAdresse = new AdressePostale(456, "Avenue des Champs", 69000, "Lyon");
        personne.modifierAdresse(nouvelleAdresse);

        // Affichage des informations
        System.out.println("Nom : " + personne.getNom());
        System.out.println("Prénom : " + personne.getPrenom());
        System.out.println("Adresse : " + personne.getAdresse());
    }
}
