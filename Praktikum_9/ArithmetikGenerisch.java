package Praktikum_9;

public class ArithmetikGenerisch<T> {
    private Rechenweg rechnung;

    public void bestimmeRechenweg(Rechenweg rechnung) {
        this.rechnung = rechnung;
    }

    public double berechne(T a, T b) {
        if (a instanceof Integer) {
            double a1 = (int) a;
            double b1 = (int) b;
            return rechnung.berechneErgebnis(a1, b1);
        }
        if (a instanceof Double) {
            double a1 = (double) a;
            double b1 = (double) b;
            return rechnung.berechneErgebnis(a1, b1);
        }
        if (a instanceof Float) {
            double a1 = (float) a;
            double b1 = (float) b;
            return rechnung.berechneErgebnis(a1, b1);
        }
        if (a instanceof Long) {
            double a1 = (long) a;
            double b1 = (long) b;
            return rechnung.berechneErgebnis(a1, b1);
        }
        if (a instanceof Short) {
            double a1 = (short) a;
            double b1 = (short) b;
            return rechnung.berechneErgebnis(a1, b1);
        }
        return 0.0;

    }


}
