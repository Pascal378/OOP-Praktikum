package Praktikum_3;

public class VergleichTest {
    public static void main(String[] args) {
        //Create arrays for testing purpose
        int[] testArrayOne = {1, 2, 3, 4};
        int[] testArrayTwo = {3, 1, 6, 2};

        //Create object
        Vergleich compare = new Vergleich();

        //Print first test
        System.out.println(compare.isEqual(testArrayOne, testArrayTwo));

        //Create arrays for testing purpose
        int[] testArrayThree = {3, 5, 1, 3};
        int[] testArrayFour = {1, 5, 3, 3};

        //Print second test
        System.out.println(compare.isEqual(testArrayThree, testArrayFour));
    }
}
