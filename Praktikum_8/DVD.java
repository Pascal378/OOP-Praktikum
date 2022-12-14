package Praktikum_8;

import java.text.DecimalFormat;

public class DVD extends Artikel {
    String title;
    String playtime;
    final int tax = 19;

    public double getPreis() {
        double netto = super.getPreis();

        return netto + (netto * (this.tax / 100.00));
    }

    public DVD(int artikelNummer, double nettoPreis, String title, String playtime) {
        super(artikelNummer, nettoPreis);
        this.title = title;
        this.playtime = playtime;
    }

    public String getInfo() {
        DecimalFormat f = new DecimalFormat("#0.00");
        return "DVD - " + this.title + " (" + this.playtime + ") : " + f.format((Math.round((this.getPreis() * 100.0)) / 100.0));
    }
}
