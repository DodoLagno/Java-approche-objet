package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {
        // Utilisation de StringBuilder
        StringBuilder builder = new StringBuilder();

        long debut = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec StringBuilder : " + (fin - debut));

        // Utilisation de String et de l'opérateur de concaténation +
        String result = "";
        debut = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            result += i;
        }

        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec String : " + (fin - debut));
    }
}
