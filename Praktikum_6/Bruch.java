package Praktikum_6;

public class Bruch {
    int numerator;
    int denominator;

    //Constructor
    Bruch(int numerator, int denominator) {

        //Check if division by zero
        if (denominator == 0) {
            System.out.println("Teilen durch 0 nicht erlaubt.");
            return;
        }

        //Prepare the fraction in case user wants a negative fraction
        if (denominator < 0 && numerator >= 0) {
            numerator = numerator * -1;
            denominator = denominator * -1;
        } else if (denominator < 0 && numerator < 0) {
            denominator = denominator * -1;
        }


        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Addition of 2 fractions
    Bruch add(Bruch f) {
        return new Bruch(
                (this.numerator * f.getDenominator()) + (f.getNumerator() * this.denominator),
                this.denominator * f.getDenominator()
        );
    }

    //Get denominator of fraction
    public int getDenominator() {
        return denominator;
    }

    //Get numerator of fraction
    public int getNumerator() {
        return numerator;
    }

    //Multiply fractions
    public Bruch multiply(Bruch f) {
        return new Bruch(
                this.numerator * f.getNumerator(),
                this.denominator * f.getDenominator()
        );
    }

    //Make fraction to string
    public String toString() {
        return ("" + numerator + " / " + denominator);
    }

}

