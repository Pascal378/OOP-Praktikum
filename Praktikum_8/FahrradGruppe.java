package Praktikum_8;

public class FahrradGruppe {
    Fahrrad startFahrrad = null;

    public void addFahrrad(Fahrrad f) {
        f.setNext(this.startFahrrad);
        this.startFahrrad = f;
    }

    public int reisegeschwindigkeit() {
        int min = startFahrrad.speed();
        Fahrrad tmp = startFahrrad;

        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            if (tmp.speed() < min) min = tmp.speed();
        }

        return min;
    }

    public void addLadung(int anzahl) {
        Fahrrad tmp;
        Fahrrad max;

        for (int i = 0; i < anzahl; i++) {
            tmp = startFahrrad;
            max = startFahrrad;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                if (max.speed() < tmp.speed()) max = tmp;
            }
            max.setLadung(max.getLadung() + 1);
        }
    }
}
