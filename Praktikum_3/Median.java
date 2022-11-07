package Praktikum_3;

import java.util.Arrays;

public class Median {

    public int median(int[] array) {

        Arrays.sort(array);

        if (array.length % 2 == 1) {
            return array[((array.length - 1) + 1) / 2];
        } else {
            return (array[(array.length - 1) / 2] + array[((array.length - 1) / 2) + 1]) / 2;
        }
    }
}
