package Praktikum_8;

public class Artikel {
    private int artikelNummer;
    private double nettoPreis;

    public Artikel(int artikelNummer, double nettoPreis) {
        this.artikelNummer = artikelNummer;
        this.nettoPreis = nettoPreis;
    }

    public double getPreis() {
        return nettoPreis;
    }

    public String getInfo() {
        return "";
    }


}
