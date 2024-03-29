package Praktikum_3;

public class Bild {
    private int[][] picture;

    public void setPicture(int[][] picture) {
        this.picture = picture;
    }

    public Bild flipAndInvert() {

        //Flip every 0 to 1 and every 1 to 0
        for (int i = 0; i < picture.length; i++) {
            for (int z = 0; z < picture[0].length; z++) {

                //Check if picture is binary, if so then flip bits
                if (picture[i][z] == 1 || picture[i][z] == 0) {
                    if (picture[i][z] == 1) {
                        picture[i][z] = 0;
                    } else {
                        picture[i][z] = 1;
                    }
                } else {
                    System.out.println("Das folgende Bild ist nicht binär.");
                    return this;
                }

            }
        }

        //Create a copy of the array that helps me invert the lines
        int[][] copy;
        copy = picture;

        //Need to start at the last index of the array to get the lower lines
        int indexOne = picture.length - 1;

        //Copy the last lines of the copy array into the first lines of the picture array -
        for (int i = 0; i < picture.length; i++) {
            for (int z = 0; z < picture[0].length; z++) {
                picture[i][z] = copy[indexOne][z];
            }
            indexOne--;
        }


        return this;
    }

    //Print picture by looping through the array
    public void ausgabe() {
        for (int i = 0; i < picture.length; i++) {
            for (int z = 0; z < picture[0].length; z++) {
                System.out.print(picture[i][z]);
            }
            System.out.print("\n");
        }
    }
}
