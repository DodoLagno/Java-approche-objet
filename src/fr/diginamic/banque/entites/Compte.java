package fr.diginamic.banque.entites;

public class Compte {
    private String numeroCompte;
    private double solde;

    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte [Numero de compte: " + numeroCompte + ", Solde: " + solde + "]";
    }
}
