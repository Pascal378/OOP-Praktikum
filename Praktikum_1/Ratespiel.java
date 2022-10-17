package Praktikum_1;

import java.util.Scanner;

public class Ratespiel {
    private static boolean found = false; //Wurde die Zahl erraten?

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 101.0); //[0..100]
        int counter = 0; //Counter zum Zählen der Versuche

        //Die Methoden werden so lange die Zahl nicht gefunden wurde wieder aufgerufen. Ein Counter zählt die Versuche
        while (!found) {
            counter++;
            pruefeZahl(rateZahl(), randomNumber, counter);
        }
    }

    //Methode die neue Zahl abfragt und einliest
    private static int rateZahl() {
        System.out.println("Raten Sie eine Zahl: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //Eingabe des Nutzers wird verglichen mit der Zufallszahl und entsprechende Anweisungen an den Nutzer ausgegeben
    private static void pruefeZahl(int guess, int random, int counter) {
        if (guess == random) {
            System.out.println("Geschafft! Zufallszahl war " + random);
            System.out.println("Anzahl an Versuchen = " + counter);
            found = true;
        } else if (guess > random) {
            System.out.println("Zufallszahl ist kleiner!");
        } else {
            System.out.println("Zufallszahl ist groeßer!");
        }
    }
}
