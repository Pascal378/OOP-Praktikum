package Praktikum_3;

public class MedianTest {
    public static void main(String[] args) {
        int[] testArrayOne = {12, 16, 2, 63, 55, 8}; // 2, 8, 12, 16, 55, 63
        int[] testArrayTwo = {42, 7, 543, 77, 87, 876, 143}; // 7, 42, 77, 87, 143, 543, 876

        Median med = new Median();

        System.out.println("Test 1:");
        System.out.println(med.median(testArrayOne));
        System.out.println("Test 2:");
        System.out.println(med.median(testArrayTwo));
    }

}
