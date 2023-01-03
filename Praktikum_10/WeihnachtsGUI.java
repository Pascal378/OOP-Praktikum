package Praktikum_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class WeihnachtsGUI extends JFrame implements KeyListener, ActionListener {
    Container c;
    JLabel authorText;
    JTextField author;

    JRadioButton fir;
    JRadioButton forrest;
    JCheckBox santa;

    JButton start;

    JLabel status;

    Leinwand leinwand;
    Leinwand noSanta;

    JPanel sidebar;
    JPanel sidebarUpper;
    JPanel sidebarCenter;

    JPanel sidebarLower;

    JPanel parameters;


    WeihnachtsGUI() {
        author = new JTextField();
        author.setText("Text");
        author.setPreferredSize(new Dimension(200, 20));

        fir = new JRadioButton();
        fir.setText("Tannenbaum");

        forrest = new JRadioButton();
        forrest.setText("Wald");

        santa = new JCheckBox();
        santa.setText("Santa");

        status = new JLabel();
        status.setText("-");

        start = new JButton();
        start.setText("Start");

        authorText = new JLabel();
        authorText.setText("Autor");

        fillContainer();

        selected();
    }

    public void fillContainer() {
        c = getContentPane();
        c.setLayout(new BorderLayout());
        sidebar = new JPanel(new BorderLayout());
        sidebarUpper = new JPanel(new FlowLayout());
        sidebarCenter = new JPanel(new BorderLayout());
        sidebarLower = new JPanel(new FlowLayout());
        parameters = new JPanel(new GridLayout(3, 1, 100, 0));
        leinwand = new Leinwand();


        sidebarUpper.add(authorText);
        sidebarUpper.add(author);
        //sidebarContent.add(start);

        parameters.setBorder(BorderFactory.createTitledBorder("Parameter"));
        parameters.add(fir);
        parameters.add(forrest);
        parameters.add(santa);

        ButtonGroup group = new ButtonGroup();
        group.add(fir);
        group.add(forrest);
        start.setPreferredSize(new Dimension(250, 20));
        sidebarCenter.add(parameters, BorderLayout.NORTH);
        sidebarLower.add(start);
        sidebar.add(sidebarUpper, BorderLayout.NORTH);
        sidebar.add(sidebarCenter, BorderLayout.CENTER);
        sidebar.add(sidebarLower, BorderLayout.SOUTH);

        c.add(status, BorderLayout.SOUTH);
        c.add(leinwand, BorderLayout.CENTER);
        c.add(sidebar, BorderLayout.EAST);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (fir.isSelected()) {
            status.setText("Tannenbaum");
            if (santa.isSelected()) status.setText("Tannenbaum und Santa");
        }
        if (forrest.isSelected()) {
            status.setText("Wald");
            if (santa.isSelected()) status.setText("Wald und Santa");
        }

        if (e.getSource() == start) {
            leinwand.stars(leinwand.getGraphics());
            noSanta.stars(noSanta.getGraphics());
            if (forrest.isSelected()) {
                int amount = ((int) Math.random() * 20) + 10;
                for (int i = 0; i < amount; i++) {
                    leinwand.growTree(leinwand.getGraphics());
                    noSanta.growTree(noSanta.getGraphics());
                }
                return;
            }
            leinwand.growTree(leinwand.getGraphics());
            noSanta.growTree(noSanta.getGraphics());
        } else repaint();

        if (santa.isSelected()) {
            if (santa.isSelected()) {
                leinwand.santa(leinwand.getGraphics(), 10);
            }
        }

    }

    public void selected() {
        fir.addActionListener(this);
        forrest.addActionListener(this);
        santa.addActionListener(this);
        start.addActionListener(this);
    }
}
