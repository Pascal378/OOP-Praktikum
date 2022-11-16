package Praktikum_4;

public class ZoomTest {

    public static void main(String[] args) {

        testOutput();


    }

    static void testOutput() {
        int[][] testArray1 = {
                {1, 7, 0},
                {1, 0, 3},
                {0, 2, 1},
        };

        int[][] testArray2 = {
                {1, 0, 2},
                {4, 2, 4},
                {2, 0, 1},
        };

        Zoom zoom1 = new Zoom(testArray1);
        Zoom zoom2 = new Zoom(testArray2);


        zoom1.setPicture(testArray1);
        System.out.println("Test 1 - Faktor ist 2:");
        zoom1.print(zoom1.zoom(2));
        System.out.println("Test 1 - Faktor ist 3:");
        zoom1.print(zoom1.zoom(3));

        zoom2.setPicture(testArray2);
        System.out.println("Test 2 - Faktor ist 2:");
        zoom2.print(zoom1.zoom(2));
        System.out.println("Test 2 - Faktor ist 3:");
        zoom2.print(zoom1.zoom(3));
    }
}
