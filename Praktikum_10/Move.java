package Praktikum_10;

import java.util.Timer;
import java.util.TimerTask;

public class Move {
    Timer move;

    public Move() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                Santa.x++;

            }
        }, 0, 4);
    }

}