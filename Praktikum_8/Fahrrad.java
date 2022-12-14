package Praktikum_8;

public class Fahrrad {
    private Fahrrad next = null;
    private int ladung = 0;
    private int maxSpeed;

    Fahrrad(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int speed() {
        if (ladung >= maxSpeed) return 0;
        return (maxSpeed - ladung);
    }

    public void setLadung(int ladung) {
        this.ladung = ladung;
    }

    public void setNext(Fahrrad nextFahrrad) {
        this.next = nextFahrrad;
    }

    public Fahrrad getNext() {
        return next;
    }

    public int getLadung() {
        return ladung;
    }
}
