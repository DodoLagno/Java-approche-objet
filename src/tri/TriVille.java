package tri;

import java.util.ArrayList;
import java.util.List;

public class TriVille {
    public static void main(String[] args) {
        List<Ville> listeVilles = new ArrayList<>();

        // Ajoutez des villes à la liste
        listeVilles.add(new Ville("Paris", 2206488));
        listeVilles.add(new Ville("Marseille", 860363));
        listeVilles.add(new Ville("Lyon", 515695));
        // Ajoutez d'autres villes selon vos besoins

        // Triez la liste par habitant en utilisant ComparatorHabitant
        listeVilles.sort(new ComparatorHabitant());

        // Affichez le résultat du tri par habitant
        System.out.println("Tri par habitant :");
        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }

        // Triez la liste par nom en utilisant ComparatorNom
        listeVilles.sort(new ComparatorNom());

        // Affichez le résultat du tri par nom
        System.out.println("Tri par nom :");
        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }
    }
}

