package Praktikum_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayingField extends JPanel implements ActionListener {


    //Field array to store the playingfield
    private Field[][] field = new Field[7][7];
    private GameLogic logic;
    private Sidebar sidebar;


    PlayingField(Sidebar sidebar) {
        this.setLayout(new GridLayout(7, 7));
        this.setSize(150, 150);
        this.setVisible(true);
        this.sidebar = sidebar;
        generateField();
        isSelected();
    }

    public void setSidebar(Sidebar sidebar) {
        this.sidebar = sidebar;
    }

    //Let all field set their colors
    public void refresh() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                this.field[i][j].setColor();
            }
        }
    }

    public void setLogic(GameLogic logic) {
        this.logic = logic;
    }

    public Field[][] getField() {
        return this.field;
    }

    public void setField(Field[][] field) {
        this.field = field;
    }

    //Generate fields into the 2d array
    public void generateField() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                this.field[i][j] = new Field();
                if ((i == 0 && j == 0) || (i == 6 && j == 6)) field[i][j].setState(3);
                this.add(field[i][j]);
            }

        }
    }

    //Add listener to all the fields
    public void isSelected() {
        for (Field[] f : field)
            for (Field t : f) {
                t.addActionListener(this);
            }


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //Get the field that was clicked on -> ask logic to move player to the field -> refresh sidebar infos and other texts
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (e.getSource() == field[i][j]) {
                    logic.move(field[i][j]);
                    sidebar.refreshInfos();
                    this.sidebar.getInfoText().setText(logic.turn());
                    if (logic.isTurnFinished() || logic.isGameFinished()) this.sidebar.getRoll().setEnabled(true);
                    if (logic.isGameFinished()) {
                        this.sidebar.getResult().setText("Ergebnis: -");
                        this.sidebar.getRoll().setEnabled(false);
                    }

                }
            }
        }
    }
}