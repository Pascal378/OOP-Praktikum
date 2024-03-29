package Praktikum_1;

import java.util.Scanner;

public class Wochentag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Scanner zum Erfassen der Eingaben initialisieren


        //Datum abfragen
        System.out.println("Bitte geben Sie den Tag an: ");
        int dd = sc.nextInt();
        System.out.println("Bitte geben Sie den Monat an: ");
        int mm = sc.nextInt();
        System.out.println("Bitte geben Sie das Jahr an: ");
        int yy = sc.nextInt();

        //Uebergabe der Eingaben an die Funktion zur Berechnung des Wochentags
        berechneWochentag(dd, mm, yy);

    }


    //Berechnung des Wochentags nach vorgegebener Formel
    private static void berechneWochentag(int day, int month, int year) {
        int weekday; //Variable zur Speicherung des Integers für den Wochentag
        int yearOriginal = getYear(year); //
        if (month < 3) {
            yearOriginal--;
        }

        weekday = (day +
                ((26 * ((getMonth(month)) + 1)) / (10)) +
                ((5 * yearOriginal) / 4) +
                (getCentury(year) / 4) +
                ((5 * getCentury(year)) - 1)
        ) % 7;

        printDay(weekday);
    }

    //Zum Berechnen der Formel werden statt dem genauen Jahr, das Jahrhundert und das jeweilige Jahr innerhalb des Jahrhunderts getrennt voneinander benötigt
    private static int getYear(int year) {
        return year % 100;
    }

    private static int getCentury(int year) {
        return year / 100;
    }

    //Januar und Februar als 13. und 14. Monat ausgeben
    private static int getMonth(int month) {
        if (month < 3) {
            return month + 12;
        } else {
            return month;
        }
    }


    //Funktion zur Ausgabe des Wochentags anhand der vorherigen Berechnungen
    private static void printDay(int dayNumber) {

        switch (dayNumber) {
            case 0 -> System.out.println("Wochentag: Sonntag");
            case 1 -> System.out.println("Wochentag: Montag");
            case 2 -> System.out.println("Wochentag: Dienstag");
            case 3 -> System.out.println("Wochentag: Mittwoch");
            case 4 -> System.out.println("Wochentag: Donnerstag");
            case 5 -> System.out.println("Wochentag: Freitag");
            case 6 -> System.out.println("Wochentag: Samstag");
            default -> System.out.println("Fehler bei der Berechnung aufgetreten. Prüfen Sie bitte Ihre Eingaben.");
        }
    }
}

