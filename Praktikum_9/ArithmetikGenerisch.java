package Praktikum_9;

public class ArithmetikGenerisch<T extends Rechenweg> {
    private T rechnung;

    public void bestimmeRechenweg(T rechnung) {
        this.rechnung = rechnung;
    }

    public double berechne(double a, double b) {

        return rechnung.berechneErgebnis(a, b);
    }
}
