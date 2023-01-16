package Praktikum_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sidebar extends JPanel implements ActionListener {
    private JPanel knight;
    private JLabel knightStrength;
    private JPanel dragon;
    private JLabel dragonStrength;
    private JPanel information;
    private JLabel infoText;
    private JPanel action;

    private JButton roll;
    private JLabel result;

    private Knight knightObject;
    private Dragon dragonObject;


    private GameLogic logic;

    private PlayingField pf;

    public JLabel getInfoText() {
        return infoText;
    }

    public void setInfoText(JLabel infoText) {
        this.infoText = infoText;
    }

    public JLabel getResult() {
        return result;
    }

    public void setResult(JLabel result) {
        this.result = result;
    }

    public JButton getRoll() {
        return roll;
    }

    public void setRoll(JButton roll) {
        this.roll = roll;
    }

    //Settings of all the members of the sidebar are here
    Sidebar(PlayingField pf) {
        knightObject = new Knight(pf);
        dragonObject = new Dragon(pf);

        this.logic = new GameLogic(dragonObject, knightObject, pf);
        pf.setLogic(logic);


        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setVisible(true);
        this.setPreferredSize(new Dimension(210, 500));

        this.pf = pf;

        Font font = new Font("Comic Sans MS", Font.BOLD, 18);

        //"Ritter"
        knightStrength = new JLabel();
        knightStrength.setText("Spielstärke: " + knightObject.getGameStrength());
        knightStrength.setFont(font);


        knight = new JPanel(new FlowLayout(FlowLayout.LEFT));
        knight.setBorder(BorderFactory.createTitledBorder("Ritter"));
        knight.add(knightStrength);

        knightStrength.setVisible(true);
        knight.setVisible(true);

        this.add(knight);

        //"Drache"
        dragonStrength = new JLabel();
        dragonStrength.setText("Spielstärke: " + dragonObject.getGameStrength());
        dragonStrength.setFont(font);
        dragon = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dragon.setBorder(BorderFactory.createTitledBorder("Drache"));
        dragon.add(dragonStrength);

        dragonStrength.setVisible(true);
        dragon.setVisible(true);

        this.add(dragon);

        //"Informationen"


        infoText = new JLabel();
        infoText.setText(logic.turn());
        infoText.setFont(font);
        information = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 100));
        information.setBorder(BorderFactory.createTitledBorder("Informationen"));
        information.add(infoText);

        infoText.setVisible(true);
        information.setVisible(true);

        this.add(information);

        //"Aktion"
        roll = new JButton();
        roll.setText("Würfeln");
        roll.setVisible(true);

        result = new JLabel();
        result.setText("Ergebnis: -");
        infoText.setText(logic.turn());
        result.setFont(font);
        result.setVisible(true);

        action = new JPanel();
        action.setLayout(new GridLayout(2, 1));
        action.setBorder(BorderFactory.createTitledBorder("Aktion"));
        action.add(roll);
        action.add(result);

        action.setVisible(true);

        this.add(action);
        selected();
    }


    //If game isn't but the turn is finished, roll a new number - set the infoText according to the current turn and disable the roll button
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.roll) {
            if (!this.logic.isGameFinished()) {
                if (this.logic.isTurnFinished()) {
                    this.result.setText("Ergebnis: " + this.logic.roll());
                    this.infoText.setText(this.logic.turn());
                    this.roll.setEnabled(false);
                }

            }
        }

    }

    //Refreshes the text of the strengths
    public void refreshInfos() {
        knightStrength.setText("Spielstärke: " + knightObject.getGameStrength());
        dragonStrength.setText("Spielstärke: " + dragonObject.getGameStrength());
    }

    //Add listener
    public void selected() {
        roll.addActionListener(this);
    }
}
