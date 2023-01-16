package Praktikum_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WeihnachtsGUI extends JFrame implements ActionListener {
    Container c;
    JLabel authorText;
    JTextField author;

    JRadioButton fir;
    JRadioButton forrest;
    JCheckBox santa;

    JButton start;

    JLabel status;

    Leinwand leinwand;

    JPanel sidebar;
    JPanel sidebarUpper;
    JPanel sidebarCenter;

    JPanel sidebarLower;

    JPanel parameters;


    //Setup layout
    WeihnachtsGUI() {
        author = new JTextField();
        author.setText("Text");
        author.setPreferredSize(new Dimension(200, 20));
        author.setToolTipText("Hier Name des Autors einfügen");

        fir = new JRadioButton();
        fir.setText("Tannenbaum");
        fir.setToolTipText("Zeichnet einen Tannenbaum");

        forrest = new JRadioButton();
        forrest.setText("Wald");
        forrest.setToolTipText("Zeichnet einen Wald aus Tannenbäumen");

        santa = new JCheckBox();
        santa.setText("Santa");
        santa.setToolTipText("Zeichnet einen Santa");

        status = new JLabel();
        status.setText("-");
        status.setToolTipText("Status der aktuellen Konfiguration");

        start = new JButton();
        start.setText("Start");
        start.setToolTipText("Startet das Zeichnen");

        authorText = new JLabel();
        authorText.setText("Autor");
        authorText.setToolTipText("Gib den Namen des Autors an");

        fillContainer();

        selected();

    }

    //Fill container with all the stuff created before
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
    public void actionPerformed(ActionEvent e) {

        //Set status texts
        if (fir.isSelected()) {
            status.setText("Tannenbaum");
            if (santa.isSelected()) status.setText("Tannenbaum und Santa");
        }
        if (forrest.isSelected()) {
            status.setText("Wald");
            if (santa.isSelected()) status.setText("Wald und Santa");
        }

        //Draw according to user configuration
        if (e.getSource() == start) {
            leinwand.stars(leinwand.getGraphics());
            if (forrest.isSelected()) {
                int amount = ((int) Math.random() * 20) + 10;
                for (int i = 0; i < amount; i++) {
                    leinwand.growTree(leinwand.getGraphics());
                }
                return;
            }
            leinwand.growTree(leinwand.getGraphics());
        } else repaint();

        //Draw santa (TODO)
        if (santa.isSelected()) {
            if (santa.isSelected()) {
                //TODO
            }
        }

    }

    //Add listeners
    public void selected() {
        fir.addActionListener(this);
        forrest.addActionListener(this);
        santa.addActionListener(this);
        start.addActionListener(this);
    }
}
