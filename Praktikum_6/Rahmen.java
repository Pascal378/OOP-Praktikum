package Praktikum_6;

public class Rahmen {


    //Print whole frame
    public void doFrame(String[] arr) {
        if (arr.length == 0) {
            System.out.println("Kein korrekter String übergeben.");
            return;
        }

        fullStars(arr);

        for (String s : arr) {
            
            System.out.print("* " + s);

            for (int z = 0; z < maxWidth(arr) - (s.length() - 1); z++) {
                System.out.print(" ");
            }

            System.out.print("*\n");
        }

        fullStars(arr);
    }

    //Determine maximum width
    private int maxWidth(String[] arr) {
        int max = 0;

        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        return max;
    }

    //Prints stars on full width - used for top and bottom line
    private void fullStars(String[] arr) {
        for (int i = 0; i < maxWidth(arr) + 4; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
