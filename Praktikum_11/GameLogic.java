package Praktikum_11;

public class GameLogic {

    //Defining stats
    private int currentTurn;
    private boolean turnFinished = true;

    private boolean gameFinished = false;

    private Token winner;

    private int lastRoll;

    private PlayingField pf;

    //Dragon object of the game
    private Dragon dragon;

    //Knight object of the game
    private Knight knight;

    //Used to determine a draw
    private Knight draw;

    private Token currentPlayer;


    GameLogic(Dragon dragon, Knight knight, PlayingField pf) {
        this.draw = new Knight(pf);
        this.draw.setName("UNENTSCHIEDEN");
        this.currentTurn = -1;
        this.dragon = dragon;
        this.knight = knight;
        this.pf = pf;
        setCurrentPlayer();
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        this.gameFinished = gameFinished;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public boolean isTurnFinished() {
        return turnFinished;
    }

    public void setTurnFinished(boolean turnFinished) {
        this.turnFinished = turnFinished;
    }

    //Sets the currentPlayer object
    public void setCurrentPlayer() {
        if (currentTurn == -1) this.currentPlayer = this.knight;
        if (currentTurn == 1) this.currentPlayer = this.dragon;
    }

    //If allowed and the game is not finished the whole object gets moved
    public void move(Field moveTo) {

        if (isAllowed(moveTo) && !this.gameFinished) {
            this.currentPlayer.move(moveTo);
            this.pf.refresh();
            this.turnFinished = true;

            //Check if game is finished - let fight if true
            checkFinish();
            if (this.gameFinished) fight();

            this.currentTurn = this.currentTurn * (-1);
            setCurrentPlayer();
        }

    }

    //Determine who is the winner
    public void fight() {
        if (this.dragon.getCurrentField() == this.knight.getCurrentField()) {
            if (this.dragon.getGameStrength() > this.knight.getGameStrength()) this.winner = this.dragon;
            if (this.dragon.getGameStrength() == this.knight.getGameStrength()) this.winner = this.draw;
            if (this.dragon.getGameStrength() < this.knight.getGameStrength()) this.winner = this.knight;
        }
    }

    //Check if both tokens are on the same field
    public void checkFinish() {
        if (this.knight.getCurrentField() == this.dragon.getCurrentField()) this.gameFinished = true;
    }

    //Return a string which gives information about the current game state
    public String turn() {
        if (gameFinished) {
            if (this.winner == this.draw) return "Unentschieden!";
            return "Der " + winner.getName() + " gewinnt!";
        }
        if (this.currentTurn == -1) return "Der Ritter ist dran!";
        if (this.currentTurn == 1) return "Der Drache ist dran";
        return "Fehler";
    }

    //Generate random number and let turn begin
    public int roll() {
        this.turnFinished = false;
        this.lastRoll = (int) (Math.random() * 3 + 1);
        return this.lastRoll;
    }

    //Get a 2d array which contains the 2 indices of a given field
    public int[] getIndex(Field f) {
        int index[] = new int[2];
        boolean found = false;

        while (!found) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (this.pf.getField()[i][j] == f) {
                        index[0] = i;
                        index[1] = j;
                        found = true;
                    }
                }
            }
        }

        return index;
    }

    //Checks if move is allowed
    public boolean isAllowed(Field moveTo) {
        if (this.turnFinished) return false;
        int[] currentIndex = getIndex(this.currentPlayer.getCurrentField());
        int[] moveToIndex = getIndex(moveTo);

        int distance0 = currentIndex[0] - moveToIndex[0];
        int distance1 = currentIndex[1] - moveToIndex[1];

        if (distance0 < 0) distance0 *= -1;
        if (distance1 < 0) distance1 *= -1;


        if ((distance1 + distance0 == this.lastRoll) || (distance1 == this.lastRoll && distance0 == this.lastRoll))
            return true;

        return false;
    }
}
