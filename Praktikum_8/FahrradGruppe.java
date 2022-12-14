package Praktikum_8;

public class FahrradGruppe {
    Fahrrad startFahrrad = null;

    public void addFahrrad(Fahrrad f) {
        f.setNext(this.startFahrrad);
        this.startFahrrad = f;
    }

    //Determine speed of the slowest bike and return it
    public int reisegeschwindigkeit() {
        if (this.startFahrrad == null) return 0;

        int min = startFahrrad.speed();
        Fahrrad tmp = startFahrrad;

        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            if (tmp.speed() < min) min = tmp.speed();
        }

        return min;
    }

    //Add weight to the bicycles
    public void addLadung(int anzahl) {
        if (this.startFahrrad == null) return;

        Fahrrad tmp;
        Fahrrad max;

        for (int i = 0; i < anzahl; i++) {
            tmp = startFahrrad;
            max = startFahrrad;

            //Check for the fastest bike before add weight
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                if (max.speed() < tmp.speed()) max = tmp;
            }

            max.setLadung(max.getLadung() + 1);
        }
    }
}
