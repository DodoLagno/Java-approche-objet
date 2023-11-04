package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("12345X", 1000.0);
        comptes[1] = new CompteTaux("56789Y", 2000.0, 0.03);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
