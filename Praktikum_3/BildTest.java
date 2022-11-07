package Praktikum_3;

public class BildTest {
    public static void main(String[] args) {
        //Create arrays for testing purpose
        int[][] testArrayOne = {{1, 1, 0, 1}, {0, 1, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] testArrayTwo = {{0, 0, 1, 1, 0}, {0, 1, 0, 1, 1}, {1, 0, 0, 1, 1}, {0, 1, 0, 1, 0}};

        //Create object for first picture, set it by using testArrayOne and immediately call the flipAndInvert() method on it
        Bild testOne = new Bild();
        testOne.setPicture(testArrayOne);
        testOne.flipAndInvert();

        //Same for the second picture
        Bild testTwo = new Bild();
        testTwo.setPicture(testArrayTwo);
        testTwo.flipAndInvert();

        //Print picture of both objects
        System.out.println("Erstes Bild:");
        testOne.ausgabe();
        System.out.println("Zweites Bild:");
        testTwo.ausgabe();
    }
}
