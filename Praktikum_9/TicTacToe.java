package Praktikum_9;

public class TicTacToe {
    int[] field;
    int currentPlayer = 1;

    TicTacToe() {
        reset();
    }

    public void reset() {
        field = new int[9];
    }

    public void zeigeSpielfeld() {
        int help = 1;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (help > 0) {
                System.out.println(getChar(field[index]) + "|" + getChar(field[index + 1]) + "|" + getChar(field[index + 2]));
                index += 3;
            } else {
                System.out.println("-+-+-");
            }
            help = help * -1;
        }
    }

    public char getChar(int number) {
        if (number == 0) return ' ';
        if (number == 1) return 'X';
        if (number == 2) return '0';
        return ' ';
    }

    public void macheZug(int x, int y) {
        if (currentPlayer == 1) {
            field[(3 * y) + x] = 1;
            currentPlayer--;
        } else {
            field[(3 * y) + x] = 2;
            currentPlayer++;
        }
    }
}