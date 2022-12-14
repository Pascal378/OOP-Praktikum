package Praktikum_8;

import java.text.DecimalFormat;

public class Kleidung extends Artikel {
    String type;
    String size;
    String color;
    final int tax = 12;


    public double getPreis() {
        double netto = super.getPreis();

        return netto + (netto * (this.tax / 100.00));
    }

    public Kleidung(int artikelNummer, double nettoPreis, String type, String size, String color) {
        super(artikelNummer, nettoPreis);
        this.type = type;
        this.size = size;
        this.color = color;
    }

    public String getInfo() {
        DecimalFormat f = new DecimalFormat("#0.00");
        
        return "Kleidung - " + this.type + ", " + this.color + " (" + this.size + ") : " + f.format(Math.round((this.getPreis() * 100.0)) / 100.0);
    }
}
