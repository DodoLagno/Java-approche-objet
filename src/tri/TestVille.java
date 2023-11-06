package tri;

import java.util.ArrayList;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> listeVilles = new ArrayList<>();

        // Ajoutez les villes à la liste
        listeVilles.add(new Ville("Paris", 2206488));
        listeVilles.add(new Ville("Marseille", 860363));
        listeVilles.add(new Ville("Lyon", 515695));
        // Ajoutez d'autres villes selon vos besoins

        // Triez la liste par population
        listeVilles.sort(null);

        // Affichez le résultat
        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }
    }
}

