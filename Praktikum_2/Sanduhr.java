package Praktikum_2;

public class Sanduhr {
    public static void main(String[] args) {
        printSanduhr(20);
    }

    private static void printSanduhr(int width) {
        upperSanduhr(width);
        lowerSanduhr(width);
    }

    //Print upper half of the hourglass
    private static void upperSanduhr(int width) {
        int lineCounter = width / 2 + (width % 2); //Calculate the amount of lines needed
        int spaces = 0; //" "
        int asteriskCounter = width; // "*"

        //Print lines according to the integer value in lineCounter
        for (int line = 0; line < lineCounter; line++) {
            //Print spaces before asterisks
            for (int firstSpaces = 0; firstSpaces < spaces; firstSpaces++) {
                System.out.print(" ");
            }
            //Print asterisks
            for (int asterisk = 0; asterisk < asteriskCounter; asterisk++) {
                System.out.print("*");
            }
            System.out.print("\n");
            spaces++; //Need 2 more spaces each line
            asteriskCounter -= 2; //Need 2 fewer asterisks each line
        }

    }

    //Print lower half of the hourglass
    private static void lowerSanduhr(int width) {
        //Initialize variables for an odd width
        int lineCounter = width / 2;
        int asteriskCounter = 3;

        //Change variables in case of even width
        if (width % 2 == 0) {
            asteriskCounter = 4;
            lineCounter--;
        }

        //Set amount of spaces needed later
        int spaces = (width - asteriskCounter) / 2;

        for (int line = 0; line < lineCounter; line++) {

            for (int firstSpaces = 0; firstSpaces < spaces; firstSpaces++) {
                System.out.print(" ");
            }

            for (int asterisk = 0; asterisk < asteriskCounter; asterisk++) {
                System.out.print("*");
            }

            System.out.print("\n");
            asteriskCounter += 2;
            spaces -= 1;
        }
    }
}