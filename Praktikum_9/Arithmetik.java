package Praktikum_9;

public class Arithmetik {

    private Rechenweg rechnung;

    public void bestimmeRechenweg(Rechenweg rechnung) {
        this.rechnung = rechnung;
    }

    public double berechne(double a, double b) {
        return rechnung.berechneErgebnis(a, b);
    }
}
