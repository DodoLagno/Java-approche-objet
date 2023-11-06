package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        // Compare les villes par population
        return Integer.compare(ville1.getPopulation(), ville2.getPopulation());
    }
}
