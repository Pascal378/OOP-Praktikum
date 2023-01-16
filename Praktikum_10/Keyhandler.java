package Praktikum_10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyhandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Santa.moveUp = true;

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Santa.moveDown = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Santa.moveUp = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Santa.moveDown = false;
        }

    }

}