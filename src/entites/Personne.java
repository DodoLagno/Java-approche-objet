package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void afficherNomPrenomMajuscules() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void modifierNom(String nouveauNom) {
        nom = nouveauNom;
    }

    public void modifierPrenom(String nouveauPrenom) {
        prenom = nouveauPrenom;
    }

    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        adresse = nouvelleAdresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }
}
