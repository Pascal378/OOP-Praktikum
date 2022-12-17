package Praktikum_9;

public class MatheAnwendung {


    public static void main(String[] args) {
        Arithmetik arithmetik = new Arithmetik();
        Rechenweg multiply = new RechenwegMal();
        Rechenweg add = new RechenwegPlus();
        Rechenweg sub = new RechenwegMinus();


        arithmetik.bestimmeRechenweg(multiply);
        System.out.println("5.5 * 10.5 = " + arithmetik.berechne(5.5, 10.5));
        arithmetik.bestimmeRechenweg(add);
        System.out.println("5.5 + 10.5 = " + arithmetik.berechne(5.5, 10.5));
        arithmetik.bestimmeRechenweg(sub);
        System.out.print("5.5 - 10.5 = " + arithmetik.berechne(5.5, 10.5));

        ArithmetikGenerisch arithmetikG = new ArithmetikGenerisch();
        arithmetikG.bestimmeRechenweg(multiply);
        System.out.println("5.5 * 10.5 = " + arithmetikG.berechne(5.5, 10.5));
        System.out.println("10 * 15 = " + arithmetikG.berechne(10, 15));
        arithmetikG.bestimmeRechenweg(add);
        System.out.println("5.5 + 10.5 = " + arithmetikG.berechne(5.5, 10.5));
        System.out.println("10 + 15 = " + arithmetikG.berechne(10, 15));
        arithmetikG.bestimmeRechenweg(sub);
        System.out.println("5.5 - 10.5 = " + arithmetikG.berechne(5.5, 10.5));
        System.out.println("10 - 15 = " + arithmetikG.berechne(10, 15));
    }
}
