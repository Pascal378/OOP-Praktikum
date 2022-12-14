package Praktikum_8;

import java.text.DecimalFormat;

public class Buch extends Artikel {
    private String author;
    private String title;
    private int releaseYear;

    final int tax = 7;

    Buch(int artikelNummer, double nettoPreis, String author, String title, int releaseYear) {
        super(artikelNummer, nettoPreis);
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }


    public double getPreis() {
        double netto = super.getPreis();

        return (netto + (netto * (this.tax / 100.00)));
    }

    public String getInfo() {
        DecimalFormat f = new DecimalFormat("#0.00");
        return "Buch - " + author + ", " + title + " (" + releaseYear + ") : " + f.format(Math.round((this.getPreis() * 100.0)) / 100.0);
    }

}
