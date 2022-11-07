package Praktikum_3;

import java.util.Arrays;

public class Median {

    //Get median of an array
    public int median(int[] array) {

        //Sort array first
        Arrays.sort(array);

        //Calculate median according to the given formula
        if (array.length % 2 == 1) {
            return array[((array.length - 1) + 1) / 2];
        } else {
            return (array[(array.length - 1) / 2] + array[((array.length - 1) / 2) + 1]) / 2;
        }
    }
}
