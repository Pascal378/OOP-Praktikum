package Praktikum_6;

public class Bruch {
    int numerator;
    int denominator;

    Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Bruch add(Bruch f) {
        return new Bruch(
                (this.numerator * f.getDenominator()) + (f.getNumerator() * this.denominator),
                this.denominator * f.getDenominator()
        );
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    Bruch multiply(Bruch f) {
        return new Bruch(
                this.numerator * f.getNumerator(),
                this.denominator * f.getDenominator()
        );
    }

    String makeString() {
        return ("" + numerator + " / " + denominator);
    }

}
