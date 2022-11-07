package Praktikum_3;

public class Vergleich {

    private int[] ArrayOne;
    private int[] ArrayTwo;

    //Check if Arrays are equal
    boolean isEqual(int[] a, int[] b) {

        //Store the given Arrays
        ArrayOne = a;
        ArrayTwo = b;

        //Sort the Arrays
        sort(ArrayOne);
        sort(ArrayTwo);

        //Check if they are not the same length
        if (ArrayOne.length != ArrayTwo.length) {
            return false;
        }

        //Loop through the sorted Arrays and compare them
        for (int i = 0; i < ArrayOne.length; i++) {
            if (ArrayOne[i] != ArrayTwo[i]) {
                return false;
            }
        }

        //Arrays are equal
        return true;
    }

    //Sort array by using the bubble sort algorithm
    public void sort(int[] a) {
        //Create helper variables
        int helper;
        int[] copy;
        copy = a;

        //Check if neighbor is smaller or equal - if so then continue. If not arrange them properly in the array and start over through a recursive call of the method
        for (int i = 0; i < a.length - 1; i++) {
            if (copy[i] <= copy[i + 1]) {
                continue;
            }
            helper = copy[i];
            copy[i] = copy[i + 1];
            copy[i + 1] = helper;
            sort(a);
        }
    }


}
