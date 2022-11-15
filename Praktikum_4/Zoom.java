package Praktikum_4;

public class Zoom {

    private int[][] picture;

    //Constructor to initialize with picture;
    public Zoom(int[][] picture) {
        if (check(picture)) {
            this.picture = picture;
        } else {
            System.out.println("Bild ungültig. Bitte Eingabe überprüfen.");
        }
    }

    //Set picture
    public void setPicture(int[][] picture) {
        if (check(picture)) {
            this.picture = picture;
        } else {
            System.out.println("Bild ungültig. Bitte Eingabe überprüfen.");
        }
    }

    //Get the picture
    public int[][] getPicture() {
        return picture;
    }


    //Zoom the picture according to the factor
    public int[][] zoom(int f) {

        //Create new picture
        int[][] zoomed = new int[this.picture.length * f][this.picture[0].length * f];

        //Coordinates for the new picture
        int x = 0;
        int y = 0;

        //Set new pixels in picture
        for (int i = 0; i < picture.length; i++) {
            for (int t = 0; t < f; t++) {
                for (int j = 0; j < picture[i].length; j++) {
                    int help = 0;
                    while (help != f) {
                        zoomed[x][y] = picture[i][j];
                        if (y != zoomed.length - 1) {
                            y++;
                        }
                        help++;
                    }
                }
                x++;
                y = 0;
            }
        }

        return zoomed;
    }

    public void print(int[][] picture) {
        for (int i = 0; i < picture.length; i++) {
            for (int z = 0; z < picture[0].length; z++) {
                System.out.print(picture[i][z]);
            }
            System.out.print("\n");
        }
    }

    //Check if array is ok
    public boolean check(int[][] picture) {
        //Check if null array
        if (picture == null || picture.length == 0) {
            return false;
        }

        //Check if picture is correct
        for (int i = 0; i < picture.length; i++) {
            for (int y = 0; y < picture[0].length; y++) {
                if (picture[i][y] < 0 || picture[i][y] > 7) {
                    return false;
                }
            }
        }

        return true;
    }
}

