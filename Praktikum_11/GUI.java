package Praktikum_11;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private Container c;
    private PlayingField playingField;
    private Sidebar sidebar;


    //Create objects needed for the GUI
    GUI() {
        this.playingField = new PlayingField(sidebar);
        this.playingField.setPreferredSize(new Dimension(490, 490));
        this.sidebar = new Sidebar(playingField);
        this.playingField.setSidebar(sidebar);

        this.c = getContentPane();

        this.c.setLayout(new BorderLayout());

        this.c.add(this.playingField, BorderLayout.CENTER);
        this.c.add(this.sidebar, BorderLayout.EAST);
    }

}
