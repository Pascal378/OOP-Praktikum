package Praktikum_10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Santa extends JLabel {
    Image image;
    static int x;
    static int y;

    static boolean moveDown;
    static boolean moveUp;

    Santa() {
        this.addKeyListener(new Keyhandler());
        this.x = 0;
        this.y = 0;
        moveDown = false;
        moveUp = false;

        try {
            this.image = ImageIO.read(new File("image/santa.png")).getScaledInstance(100, 100, 1);

        } catch (IOException e) {
            System.out.println("Bild konnte nicht geladen werden");
        }
    }

    public void paintComponent(Graphics g) {

        if (image != null) {
            g.drawImage(image, x, y, this);

        }

        repaint();
    }
}
