import java.util.Scanner;

public class Wochentag {
    public static void main(String[] args){

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
    public static void berechneWochentag(int ddP,int mmP, int yyP){
        int w;

        w = (   ddP +
                ((26*((getMonth(mmP)) + 1))/ (10)) +
                ((5 * getYear(yyP)) / 4) +
                (getCentury(yyP)/4)+
                ((5*getCentury(yyP)) - 1)
            ) % 7;


        printDay(w);
    }

    //Zum Berechnen der Formel werden statt dem genauen Jahr, das Jahrhundert und das jeweilige Jahr innerhalb des Jahrhunderts getrennt von einander benötigt
    public static int getYear(int yyP){
        return yyP%100;
    }

    public static int getCentury(int yyP){ return yyP/100;}

    //Januar und Februar als 13. und 14. Monat ausgeben
    public static int getMonth(int mmP){
        if(mmP < 3){
            return mmP+11;
        }
        else {
            return mmP;
        }
    }


    //Funktion zur Ausgabe des Wochentags anhand der vorherigen Berechnungen
    public static void printDay(int dayNumber){

        switch(dayNumber){
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

