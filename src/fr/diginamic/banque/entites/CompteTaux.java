package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxDeRémunération;

    public CompteTaux(String numeroCompte, double solde, double tauxDeRémunération) {
        super(numeroCompte, solde);
        this.tauxDeRémunération = tauxDeRémunération;
    }

    @Override
    public String toString() {
        return super.toString() + " Taux de rémunération: " + tauxDeRémunération;
    }
}
