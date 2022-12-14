package Praktikum_8;

public class ArtikelTest {
    public static void main(String[] args) {
        Buch java = new Buch(1, 35.00, "Max Mustermann", "Java das Buch", 2011);
        Buch java2 = new Buch(2, 35.00, "Max Mustermann", "Java noch ein Buch", 2021);
        DVD dvd = new DVD(3, 17.79, "Java: Der Film, Classic Collection", "2:21");
        Kleidung shirt = new Kleidung(4, 10.00, "T-Shirt", "M", "blau");

        Warenkorb cart = new Warenkorb();

        cart.addArtikel(java);
        cart.addArtikel(java2);
        cart.addArtikel(dvd);
        cart.addArtikel(shirt);

        cart.zeigeWarenkorb();

    }
}
