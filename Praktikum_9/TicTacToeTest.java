package Praktikum_9;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe tic = new TicTacToe();


        tic.macheZug(2, 2);
        tic.macheZug(2, 1);
        tic.macheZug(2, 0);
        tic.zeigeSpielfeld();
    }
}
