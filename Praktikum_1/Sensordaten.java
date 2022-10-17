package Praktikum_1;

import java.util.Scanner;

public class Sensordaten {
    private static boolean zeroFound = false;
    private static boolean tripletOnes = false;
    private static int oneCounter = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (!tripletOnes) {
            System.out.println("Messwert angeben: ");
            checkNumber(sc.nextInt());
        }
    }

    private static void checkNumber(int number) {
        if (number > 0) {
            zeroFound = false;
            if (number == 1) {
                oneCounter++;
                if (oneCounter == 3) {
                    tripletOnes = true;
                }
            }
        } else if (number == 0) {
            if (!zeroFound) {
                System.out.println(number);
                zeroFound = true;
            }
            oneCounter = 0;
        } else {
            System.out.println(number * -1);
            zeroFound = false;
            oneCounter = 0;
        }
    }
}