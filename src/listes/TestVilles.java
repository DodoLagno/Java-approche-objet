package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Recherche de la ville la plus peuplée
        Ville villePlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNombreHabitants() > villePlusPeuplee.getNombreHabitants()) {
                villePlusPeuplee = ville;
            }
        }

        System.out.println("La ville la plus peuplée est : " + villePlusPeuplee.getNom());

        // Suppression de la ville la moins peuplée
        Ville villeMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNombreHabitants() < villeMoinsPeuplee.getNombreHabitants()) {
                villeMoinsPeuplee = ville;
            }
        }
        villes.remove(villeMoinsPeuplee);

        // Modification des noms des villes de plus de 100 000 habitants en majuscules
        for (Ville ville : villes) {
            if (ville.getNombreHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Affichage de la liste résultante
        for (Ville ville : villes) {
            System.out.println("A " + ville.getNom() + ", le nombre d'habitants est de " + ville.getNombreHabitants() + ".");
        }
    }
}
