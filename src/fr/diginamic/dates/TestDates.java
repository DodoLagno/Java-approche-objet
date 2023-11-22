package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {
        // Créer une instance de la classe java.util.Date à la date du jour
        Date currentDate = new Date();

        // Afficher l’instance au format jour/mois/année
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + sdf1.format(currentDate));

        // Créer une instance de la classe Date à la date du 19/05/2016 à 23:59:30 secondes
        Date specificDate = new Date(116, 4, 19, 23, 59, 30);

        // Afficher l’instance au format année/mois/jour heure:minute:seconde
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + sdf2.format(specificDate));

        // Créer une instance de Date contenant la date/heure système
        Date systemDate = new Date();

        // Afficher l’instance au même format que ci-dessus
        System.out.println("Date système : " + sdf2.format(systemDate));
    }
}
