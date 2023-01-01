package Praktikum_9;

public class OOPCode {
    private boolean[][] field;
    private boolean[][] original;
    private int[][] numberField;

    int rotation = 0;

    OOPCode(boolean[][] field) {
        this.field = field;
        this.original = field;
        this.numberField();
    }

    public void rotate() {
        boolean[][] tmp = new boolean[this.field[0].length][this.field.length];
        int help = 0;

        for (int i = 0; i < tmp.length; i++) {
            for (int j = this.field.length - 1; j >= 0; j--) {
                tmp[i][help] = this.field[j][i];
                help++;
            }
            help = 0;
        }
        this.field = tmp;
        rotateCalc();
    }

    public void rotateCalc() {
        if (this.rotation < 4) this.rotation++;
        if (this.rotation == 4) this.rotation = 0;
    }

    public void print() {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void deepcopy(OOPCode code) {
        this.field = code.field;
        this.numberField = code.numberField;
        this.rotation = code.rotation;
    }

    public void printNumbers() {
        for (int i = 0; i < this.numberField.length; i++) {
            for (int j = 0; j < this.numberField.length; j++) {
                System.out.print(numberField[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void numberField() {
        this.numberField = new int[this.field.length][this.field.length];
        int power = (this.field.length * this.field.length) - 1;

        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field.length; j++) {
                numberField[i][j] = (int) Math.pow(2, power);
                power--;
            }
        }
    }

    public int getCode() {
        int code = 0;
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field.length; j++) {
                if (this.field[i][j] == true) {
                    code += this.numberField[i][j];
                }
            }
        }

        return code;
    }

    public void maxCode() {
        OOPCode tmp = new OOPCode(this.original);
        OOPCode max = new OOPCode(this.original);

        for (int i = 0; i < 4; i++) {
            tmp.rotate();
            if (tmp.getCode() > max.getCode()) {
                max.deepcopy(tmp);
            }
        }

        System.out.println("Zahlenbild der Loesung: ");
        max.printNumbers();
        System.out.println("OOP-Bild der Loesung: ");
        max.print();
        System.out.println("Anzahl an Rotation:" + max.rotation);
        System.out.println("Code: " + max.getCode());
    }

    public int getRotation() {
        return rotation;
    }
}
