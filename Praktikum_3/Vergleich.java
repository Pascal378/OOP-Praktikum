package Praktikum_3;

public class Vergleich {

    private int[] arrayOne;
    private int[] arrayTwo;

    //Check if Arrays are equal
    boolean isEqual(int[] a, int[] b) {

        //Store the given Arrays
        arrayOne = a;
        arrayTwo = b;

        //Sort the Arrays
        sort(arrayOne);
        sort(arrayTwo);

        //Check if they are not the same length
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }


        //Check if both arrays are "null" and return true - they are eqaul
        if (arrayOne == null && arrayTwo == null) {
            return true;
        }

        //Check if only one of the arrays is null and return false - they are not equal
        if ((arrayOne == null && arrayTwo != null) || (arrayOne != null && arrayTwo == null)) {
            return false;
        }


        //Loop through the sorted Arrays and compare them
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
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
