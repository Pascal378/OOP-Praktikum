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

        System.out.println("Wochentag: " + berechneWochentag(dd, mm, yy));

    }


    public static int berechneWochentag(int ddP,int mmP, int yyP){
        int w;

        w = (   ddP +
                ((26*((getMonth(mmP)) + 1))/ (10)) +
                ((5 * getYear(yyP)) / 4) +
                (getCentury(yyP)/4)+
                ((5*getCentury(yyP)) - 1)
            ) % 7;

        return w;
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

}
