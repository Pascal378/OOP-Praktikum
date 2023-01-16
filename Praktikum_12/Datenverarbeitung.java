package Praktikum_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Datenverarbeitung {
    protected double[][] cluster1 = new double[50][5]; //Iris-setosa
    protected double[][] cluster2 = new double[50][5];
    ; //Iris-versicolor
    protected double[][] cluster3 = new double[50][5];
    ; //Iris-virginica

    final public void ladenVerarbeitenSpeichern(String path) {
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        try {
            File data = new File(path);
            Scanner scanner = new Scanner(data);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                if (line[4] == "Iris-setosa") {
                    cluster1[index1][0] = Double.parseDouble(line[0]);
                    cluster1[index1][1] = Double.parseDouble(line[1]);
                    cluster1[index1][2] = Double.parseDouble(line[2]);
                    cluster1[index1][3] = Double.parseDouble(line[3]);
                    index1++;
                }
                if (line[4] == "Iris-versicolor") {
                    cluster2[index2][0] = Double.parseDouble(line[0]);
                    cluster2[index2][1] = Double.parseDouble(line[1]);
                    cluster2[index2][2] = Double.parseDouble(line[2]);
                    cluster2[index2][3] = Double.parseDouble(line[3]);
                    index2++;
                }
                if (line[4] == "Iris-virginica") {
                    cluster3[index3][0] = Double.parseDouble(line[0]);
                    cluster3[index3][1] = Double.parseDouble(line[1]);
                    cluster3[index3][2] = Double.parseDouble(line[2]);
                    index3++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fehler beim Lesen der Datei.");
            e.printStackTrace();
        }

    }

    public abstract double berechneAbstand(double[] x, double[] y);

    public double[] berechneMittelwert(double[][] x) {

        return null;
    }

    public void ladeDaten(String data) {

    }

    public void ausgabe(double a, double b, double c) {

    }


}
