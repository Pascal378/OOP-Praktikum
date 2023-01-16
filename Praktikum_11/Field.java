package Praktikum_11;

import javax.swing.*;
import java.awt.*;

public class Field extends JButton {

    // 0 - "sea"
    // 1 - "vulcano"
    // 2 - "meadow"
    // 3 - "start"
    private int state;

    Dragon dragon;
    Knight knight;

    Field() {
        Font font = new Font("Comic Sans MS", Font.BOLD, 50);
        this.setFont(font);
        this.setForeground(Color.white);
        this.state = (int) (Math.random() * 3);
        setColor();
        this.setFocusPainted(false);
    }

    public int getState() {
        return state;
    }

    //Set the color of the field according to its state
    public void setColor() {
        if (this.state == 0) this.setBackground(Color.blue);
        if (this.state == 1) this.setBackground(Color.red);
        if (this.state == 2) this.setBackground(Color.green);
        if (this.state == 3) this.setBackground(Color.black);

        if (this.dragon == null && this.knight == null) this.setText("");
        if (this.dragon != null && this.knight != null) this.setText("X");
        if (this.dragon != null && this.knight == null) this.setText("D");
        if (this.dragon == null && this.knight != null) this.setText("R");
    }

    public void setState(int state) {
        this.state = state;
        setColor();
    }


    //Place a dragon on this field
    public void placeToken(Dragon dragon) {
        if (dragon.getLastField() != null) dragon.getLastField().unplace();
        this.dragon = dragon;
        setColor();
    }

    //Unplace any token from this field
    public void unplace() {
        this.dragon = null;
        this.knight = null;
    }

    //Place a knight on this field
    public void placeToken(Knight knight) {
        if (knight.getLastField() != null) knight.getLastField().unplace();
        this.knight = knight;
        setColor();
    }
}
