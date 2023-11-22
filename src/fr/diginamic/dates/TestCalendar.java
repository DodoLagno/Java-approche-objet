package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        // Utiliser la classe java.util.Calendar pour créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date calendarDate1 = calendar1.getTime();

        // Afficher l’instance au format jour/mois/année
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date avec Calendar (format jour/mois/année) : " + sdf1.format(calendarDate1));

        // Utiliser la classe java.util.Calendar pour créer une instance de Date à la date du jour
        Calendar calendar2 = Calendar.getInstance();
        Date calendarDate2 = calendar2.getTime();

        // Afficher l’instance au format année/mois/jour heure:minute:seconde
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date actuelle avec Calendar (format année/mois/jour heure:minute:seconde) : " + sdf2.format(calendarDate2));

        // Afficher la même instance avec le nom des jours et des mois en différentes langues
        displayWithLocale(calendarDate2, Locale.FRENCH);
        displayWithLocale(calendarDate2, Locale.ENGLISH);  // English as a reference
        displayWithLocale(calendarDate2, Locale.CHINESE);
        displayWithLocale(calendarDate2, Locale.GERMAN);
    }

    private static void displayWithLocale(Date date, Locale locale) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EEEE HH:mm:ss", locale);
        System.out.println("Date with " + locale.getDisplayLanguage() + ": " + sdf.format(date));
    }
}
