package Praktikum_12;

public class DatenTest {
    public static void main(String[] args) {
        Abstand1 distance1 = new Abstand1();
        Abstand2 distance2 = new Abstand2();

        distance1.ladenVerarbeitenSpeichern("image/iris-2.data.txt");
        distance2.ladenVerarbeitenSpeichern("image/iris-2.data.txt");

    }
}
