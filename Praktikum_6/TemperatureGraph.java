package Praktikum_6;

public class TemperatureGraph {
    int year;
    int[] temperatures = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    TemperatureGraph(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Ungültige Jahreszahl");
        }
    }

    void addTemperatur(int monat, int temperatur) {
        if (monat < 0 && monat > 12) {
            System.out.println("Ungültiger Monat.");
            return;
        }

        if (temperatur < 0) {
            System.out.println("Ungültige Temperatur.");
            return;
        }
        this.temperatures[monat - 1] = temperatur;
    }

    void plotGraph() {
        if (!checkTemperatures()) return;

        System.out.println("Jahr: 2004");

        for (int i = getMax(); i >= getMin(); i--) {

            if (i < 10) System.out.print(i + "  ");
            else System.out.print(i + " ");

            for (int temperature : temperatures) {
                if (temperature >= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    boolean checkTemperatures() {
        for (int temperature : temperatures) {
            if (temperature < 0) return false;
        }

        return true;
    }


    public int getMin() {
        int min = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature < min) min = temperature;
        }

        return min;
    }

    public int getMax() {
        int max = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature > max) max = temperature;
        }

        return max;
    }
}
