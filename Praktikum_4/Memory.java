package Praktikum_4;

import java.util.ArrayList;

public class Memory {

    //Generate field
    int[][] generateField(int n) {
        //Check Parameter
        if (n % 2 == 1) {
            System.out.println("Ungültiges Spielfeld.");
            return null;
        }

        ArrayList<Integer> pairs = new ArrayList<Integer>(); // Create a list to store pairs

        //Generate pairs
        for (int i = 0; i < ((n * n) / 2); i++) {
            pairs.add(i + 5);
            pairs.add(i + 5);
        }

        //Initialize field
        int[][] field = new int[n][n];

        //Fill field randomly with numbers of the pair List
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                int number = (int) (Math.random() * pairs.size());
                field[y][x] = pairs.get(number);
                pairs.remove(number);
            }
        }

        return field;
    }

    //Print field
    public void printField(int[][] field) {
        if (field == null || field.length == 0) {
            return;
        }

        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                System.out.print(field[y][x] + " ");
            }
            System.out.print("\n");
        }
    }
}
