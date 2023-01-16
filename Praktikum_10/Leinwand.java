package Praktikum_10;

import javax.swing.*;
import java.awt.*;

public class Leinwand extends JPanel {

    private int santaX = 0;

    Leinwand() {
        this.setBackground(Color.black);
    }

    //Draw a tree with random size at random position
    public void growTree(Graphics g) {
        //Random position
        boolean calcHeight = true;
        boolean calcWidth = true;
        int randomX = 0;
        int randomY = 0;

        //Random size
        int randomSize = (int) (Math.random() * 30);

        while (calcHeight || calcWidth) {
            randomX = (int) (Math.random() * this.getWidth() + randomSize);
            randomY = (int) (Math.random() * this.getHeight() + 200);
            calcWidth = true;
            calcHeight = true;

            if (this.getWidth() > randomSize + randomX + 90) {
                calcWidth = false;
            }
            if (this.getHeight() > randomY + 80) {
                calcHeight = false;
            }
        }


        //Random colors
        int randomColor1 = (int) (Math.random() * 256);
        int randomColor2 = (int) (Math.random() * 256);
        int randomColor3 = (int) (Math.random() * 256);


        //Tree consists of 3 polygons on top of each other - they get drawn here
        g.setColor(new Color(randomColor1, randomColor2, randomColor3));
        int[] x = {50 + randomX, 85 + randomX + randomSize, 10 + randomX - randomSize};
        int[] y = {10 + randomY - randomSize, 50 + randomY, 50 + randomY};
        int length = 3;

        g.fillPolygon(x, y, length);

        int[] x1 = {50 + randomX, 90 + randomX + randomSize, 5 + randomX - randomSize};
        int[] y1 = {30 + randomY - randomSize, 65 + randomY, 65 + randomY};
        g.fillPolygon(x1, y1, length);

        int[] x2 = {50 + randomX, 95 + randomX + randomSize, randomX - randomSize};
        int[] y2 = {50 + randomY - randomSize, 80 + randomY, 80 + randomY};
        g.fillPolygon(x2, y2, length);
    }

    //Draw stars at random position
    public void stars(Graphics g) {
        int amount = (int) (Math.random() * 1000 + 100);

        boolean calcHeight = true;
        boolean calcWidth = true;
        int randomX = 0;
        int randomY = 0;

        for (int i = 0; i < amount; i++) {
            while (calcHeight || calcWidth) {
                randomX = (int) (Math.random() * this.getWidth());
                randomY = (int) (Math.random() * 200);
                calcWidth = true;
                calcHeight = true;

                if (this.getWidth() > randomX + 5) {
                    calcWidth = false;
                }
                if (this.getHeight() > randomY + 5) {
                    calcHeight = false;
                }
            }

            g.setColor(Color.white);
            g.fillOval(randomX, randomY, 5, 5);

            calcWidth = true;
            calcHeight = true;
        }
    }
}
