package Praktikum_1;

import java.util.Scanner;

public class Ratespiel {
    private static boolean found = false; //Boolean to check if the right number was guessed

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 101.0); //[0..100]
        int counter = 0; //Count the amount of tries

        //As long as the correct number hasn't been found/guessed, ask for a new guess and check it directly - also counting the amount of tries
        while (!found) {
            counter++;
            pruefeZahl(rateZahl(), randomNumber, counter);
        }
    }

    //Read in new number from user input
    private static int rateZahl() {
        System.out.println("Raten Sie eine Zahl: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //Compare user input to the generated random number and print the corresponding output - in case of the right guess, "found" becomes true and the programm will stop
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

