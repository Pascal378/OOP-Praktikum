package Praktikum_3;

public class BildTest {
    public static void main(String[] args) {
        int[][] testArrayOne = {{1, 1, 0, 1}, {0, 1, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] testArrayTwo = {{0, 0, 1, 1, 0}, {0, 1, 0, 1, 1}, {1, 0, 0, 1, 1}, {0, 1, 0, 1, 0}};

        Bild testOne = new Bild();
        testOne.setPicture(testArrayOne);
        testOne.flipAndInvert();

        Bild testTwo = new Bild();
        testTwo.setPicture(testArrayTwo);
        testTwo.flipAndInvert();

        System.out.println("Erstes Bild:");
        testOne.ausgabe();
        System.out.println("Zweites Bild:");
        testTwo.ausgabe();
    }
}
