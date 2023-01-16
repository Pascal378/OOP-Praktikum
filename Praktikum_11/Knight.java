package Praktikum_11;

public class Knight extends Token {

    private int gameStrength;
    private PlayingField pf;

    Knight(PlayingField pf) {
        this.setName("RITTER");
        this.gameStrength = this.getSpeed() + this.getIntelligence() * 2;

        int random = (int) (Math.random() * 41);
        this.gameStrength = this.gameStrength * (120 - random) / 100;

        this.pf = pf;

        this.setCurrentField(pf.getField()[0][0]);
        this.getCurrentField().placeToken(this);
    }

    //Moves the token to another field and also activates the according fieldpower
    public void move(Field moveTo) {
        super.move(moveTo);
        this.getCurrentField().placeToken(this);
        fieldPower(moveTo);
    }

    // Calculate the new gamestrength
    // 0 - "sea" - nothing happens
    // 1 - "volcano" - 10 %
    // 2 - "meadow" + 10%
    public void fieldPower(Field moveTo) {
        double calc;

        if (moveTo.getState() == 0) return;

        if (moveTo.getState() == 1) {
            calc = ((double) this.gameStrength / 10) * 9;
            this.gameStrength = (int) calc;
        }

        if (moveTo.getState() == 2) {
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
