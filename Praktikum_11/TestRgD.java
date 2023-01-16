package Praktikum_11;

import javax.swing.*;

public class TestRgD {


    public static void main(String[] args) {
        GUI gui = new GUI();

        gui.setTitle("Ritter gegen Drache");
        gui.setSize(750, 500);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setResizable(false);
    }
}
