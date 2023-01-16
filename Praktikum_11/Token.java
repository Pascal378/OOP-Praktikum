package Praktikum_11;

public class Token {
    //Defining stats
    private int speed;
    private int intelligence;
    private String name;
    private Field lastField = null;
    private Field currentField;


    //Use random stats when initializing
    Token() {
        this.speed = 8 - ((int) (Math.random() * 3));
        this.intelligence = 8 - ((int) (Math.random() * 3));
    }

    //Moves this object to another field
    public void move(Field moveTo) {
        this.lastField = this.currentField;

        this.currentField = moveTo;
    }

    public Field getCurrentField() {
        return this.currentField;
    }

    public void setCurrentField(Field currentField) {
        this.currentField = currentField;
    }

    public Field getLastField() {
        return lastField;
    }

    public void setLastField(Field field) {
        this.lastField = field;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
