package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        // Compare les villes par nom
        return ville1.getNom().compareTo(ville2.getNom());
    }
}
