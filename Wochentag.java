import java.util.Scanner;

public class Wochentag {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Tag an: ");
        int dd = sc.nextInt();
        System.out.println("Bitte geben Sie den Monat an: ");
        int mm = sc.nextInt();
        System.out.println("Bitte geben Sie das Jahr an: ");
        int yy = sc.nextInt();

        berechneWochentag(dd, mm, yy);

    }


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

    public static int getYear(int yyP){
        return yyP%100;
    }

    public static int getCentury(int yyP){

        return yyP/100;
    }

    public static int getMonth(int mmP){
        if(mmP < 3){
            return mmP+11;
        }
        else {
            return mmP;
        }
    }


    public static void printDay(int dayNumber){

        switch(dayNumber){
            case 0:
                System.out.println("Wochentag: Sonntag");
                break;
            case 1:
                System.out.println("Wochentag: Montag");
                break;
            case 2:
                System.out.println("Wochentag: Dienstag");
                break;
            case 3:
                System.out.println("Wochentag: Mittwoch");
                break;
            case 4:
                System.out.println("Wochentag: Donnerstag");
                break;
            case 5:
                System.out.println("Wochentag: Freitag");
                break;
            case 6:
                System.out.println("Wochentag: Samstag");
                break;
            default:
                System.out.println("Fehler bei der Berechnung aufgetreten. Prüfen Sie Ihre Eingaben.");
                break;
        }
    }
}

