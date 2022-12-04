package Praktikum_6;

public class RahmenTest {
    public static void main(String[] args) {
        String[] test = {"Rahmen", "sind", "toll"};
        String[] test2 = {"Das ist", "ein", "Test"};


        Rahmen frame = new Rahmen();

        frame.doFrame(test);
        frame.doFrame(test2);


    }
}
