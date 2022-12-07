package Praktikum_7;

public class BildTest {
    public static void main(String[] args) {
        Bild picture = new Bild();

        picture.leseBild("java.pgm");
        System.out.println(picture.dataAsString());
        picture.rotiereBild();
        System.out.println(picture.dataAsString());
        picture.schreibeBild("");
    }
}
