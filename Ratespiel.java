import java.util.*;

public class Ratespiel {
    static boolean found = false; //Wurde die Zahle erraten?

    public static void main(String[] args){

        int randomNumber = (int)(Math.random() * 101.0); //[0..100]
        int counter = 0; //Counter zum Zählen der Versuche

        //Die Methoden werden so lange die Zahl nicht gefunden wurde wieder aufgerufen. Ein Counter zählt die Versuche
        while (!found){
            counter++;
            pruefeZahl(rateZahl(),randomNumber, counter);
        }
    }

    //Methode die neue Zahl abfragt und einliest
    public static int rateZahl(){
        System.out.println("Raten Sie eine Zahl: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //Eingabe des Nutzers wird verglichen mit der Zufallszahl und entsprechende Anweisungen an den Nutzer ausgegeben
    public static void pruefeZahl(int guess, int random, int counterS){
        if (guess == random){
            System.out.println("Geschafft! Zufallszahl war " + random);
            System.out.println("Anzahl an Versuchen = " + counterS);
            found = true;
        } else if (guess > random) {
            System.out.println("Zufallszahl ist kleiner!");
        } else if (guess < random) {
            System.out.println("Zufallszahl ist größer!");
        }
    }
}
