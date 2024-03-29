package Praktikum_8;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Warenkorb {
    ArrayList<Artikel> artikelListe = new ArrayList<>();

    //Add article to shopping cart
    public void addArtikel(Artikel a) {
        artikelListe.add(a);
    }

    //Remove article from shopping cart
    public void removeArtikel(Artikel a) {
        artikelListe.remove(a);
    }

    //Print content of shopping cart
    public void zeigeWarenkorb() {
        double sum = 0.00;
        for (Artikel k : artikelListe) {
            System.out.println(k.getInfo());
            sum += k.getPreis();
        }
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("Gesamtpreis: " + f.format(Math.round((sum * 100.0)) / 100.0) + " Euro");
    }
}
