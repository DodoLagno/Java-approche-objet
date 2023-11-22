package fr.diginamic.dates;

import listes.Ville;

public class TestEquals {

    public static void main(String[] args) {
        Ville ville1 = new Ville("Paris", 2200000);
        Ville ville2 = new Ville("Paris", 2200000);
        Ville ville3 = new Ville("Londres", 8900000);

        // Vérifiez que la méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs
        System.out.println("Ville1 equals Ville2 : " + ville1.equals(ville2));

        // Vérifiez maintenant que la méthode retourne false si vous changez un des attributs
        System.out.println("Ville1 equals Ville3 : " + ville1.equals(ville3));

        // Faites le test maintenant en utilisant l’opérateur == avec les mêmes attributs
        System.out.println("Ville1 == Ville2 : " + (ville1 == ville2));

        // Puis avec des attributs différents
        System.out.println("Ville1 == Ville3 : " + (ville1 == ville3));

        // Comment faire pour que la comparaison de 2 villes avec l’opérateur == retourne true
        // Pour cela, assurez-vous que les deux références pointent vers le même objet.
        Ville ville4 = ville1;
        System.out.println("Ville1 == Ville4 : " + (ville1 == ville4));
    }
}

