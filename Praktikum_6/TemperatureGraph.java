package Praktikum_6;

public class TemperatureGraph {
    int year;
    int[] temperatures = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};


    //Constructor
    TemperatureGraph(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Ungültige Jahreszahl");
        }
    }

    //Add temperature of specific month
    void addTemperatur(int monat, int temperatur) {

        if (monat < 1 && monat > 12) {
            System.out.println("Ungültiger Monat.");
            return;
        }

        if (temperatur < 0) {
            System.out.println("Ungültige Temperatur.");
            return;
        }
        this.temperatures[monat - 1] = temperatur;
    }

    //Print the graph
    void plotGraph() {
        if (!checkTemperatures()) return;

        System.out.println("Jahr: 2004");

        for (int i = getMax(); i >= getMin(); i--) {

            //Spaces according to digits of temperature
            if (i >= 100) System.out.print(i + " ");
            else if (i >= 10) System.out.print(i + "  ");
            else System.out.print(i + "   ");

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

    //Check if temperatures are all above 0 - also checks if temperature is even added since array is initialized with "-1" on every index
    boolean checkTemperatures() {
        for (int temperature : temperatures) {
            if (temperature < 0) return false;
        }

        return true;
    }


    //Check for min temperature
    public int getMin() {
        int min = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature < min) min = temperature;
        }

        return min;
    }

    //Check for max temperature
    public int getMax() {
        int max = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature > max) max = temperature;
        }

        return max;
    }
}
