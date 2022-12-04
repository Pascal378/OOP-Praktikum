package Praktikum_6;

public class BruchTest {
    public static void main(String[] args) {

        Bruch bruch = new Bruch(-2, -2);
        Bruch bruch2 = new Bruch(-1, 2);

        System.out.println("Erster Bruch:\n" + bruch.toString() + "\nZweiter Bruch:\n" + bruch2.toString() + "\n");
        System.out.println("Ergebnis Addition:");
        System.out.println(bruch.add(bruch2).toString());
        System.out.println("Ergebnis Multiplikation:");
        System.out.println(bruch.multiply(bruch2).toString());
    }
}
