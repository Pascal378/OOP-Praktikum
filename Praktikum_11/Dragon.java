package Praktikum_11;

public class Dragon extends Token {

    private int gameStrength;
    private PlayingField pf;

    Dragon(PlayingField pf) {
        this.setName("DRACHE");

        this.gameStrength = 2 * this.getSpeed() + this.getIntelligence();

        int random = (int) (Math.random() * 41);
        System.out.println(random);
        this.gameStrength = this.gameStrength * (120 - random) / 100;

        this.pf = pf;

        this.setCurrentField(pf.getField()[6][6]);
        this.getCurrentField().placeToken(this);

    }


    //Move the token to another field and activate the fieldpower
    public void move(Field moveTo) {
        super.move(moveTo);
        this.getCurrentField().placeToken(this);
        fieldPower(moveTo);
    }

    // 0 - "sea"
    // 1 - "volcano"
    // 2 - "meadow"
    public void fieldPower(Field moveTo) {
        double calc;

        if (moveTo.getState() == 0) return;
        if (moveTo.getState() == 2) {
            calc = ((double) this.gameStrength / 10) * 9;
            this.gameStrength = (int) calc;
        }
        if (moveTo.getState() == 1) {
            calc = ((double) this.gameStrength / 10) * 11;
            this.gameStrength = (int) calc;
        }
    }

    public int getGameStrength() {
        return gameStrength;
    }

    public void setGameStrength(int gameStrength) {
        this.gameStrength = gameStrength;
    }
}
