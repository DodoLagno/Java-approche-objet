
package fr.diginamic.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDates2 {

    public static void main(String[] args) {
        // Créer une instance de la classe java.time.LocalDate à la date du jour
        LocalDate currentDate = LocalDate.now();
        System.out.println("Date du jour : " + currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Créer une instance de la classe LocalDate à la date du 19/05/2016
        LocalDate specificDate = LocalDate.of(2016, 5, 19);
        LocalDateTime specificDateTime = specificDate.atTime(23, 59, 30);

        // Afficher l’instance au format année/mois/jour heure:minute:seconde
        System.out.println("Date spécifique : " + specificDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));

        // Créer une instance de LocalDateTime contenant la date/heure système
        LocalDateTime systemDateTime = LocalDateTime.now();
        System.out.println("Date système : " + systemDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
    }
}
