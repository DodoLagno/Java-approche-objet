package tri;

public class Ville implements Comparable<Ville> {
    private final String nom;
    private final int population;

    public Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public int compareTo(Ville autre) {
        // Compare les villes par population
        return Integer.compare(this.population, autre.getPopulation());
    }

    @Override
    public String toString() {
        return nom + " - Population : " + population;
    }
}
