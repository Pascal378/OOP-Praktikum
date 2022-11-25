package Praktikum_6;

public class BruchTest {
    public static void main(String[] args) {

        Bruch bruch = new Bruch(1, 2);
        Bruch bruch2 = new Bruch(2, 3);


        System.out.println(bruch.add(bruch2).makeString());
        System.out.println(bruch.multiply(bruch2).makeString());
    }
}
