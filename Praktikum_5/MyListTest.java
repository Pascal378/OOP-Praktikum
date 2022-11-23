package Praktikum_5;

public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.addToList(0, -1);
        list.addToList(1, 2);
        list.addToList(2, 4);
        list.addToList(3, 3);
        list.addToList(4, 2);
        list.addToList(5, 6);
        list.addToList(6, 5);
        list.addToList(-1, 8);

        System.out.println("Ausgabe der Liste:");
        list.print();

        System.out.println("Ausgabe nach Loeschen von Element an Index:");
        list.removeFromList(6);
        list.print();
        System.out.println();

        System.out.println("Ausgabe der sortierten Liste:");
        list.sortList();
        list.print();
        System.out.println();

        System.out.println("Ausgabe nach Funktion Kombi-Zahl:");
        list.kombiZahl(8);
        System.out.println();

        System.out.println("Entfernte Duplikate: " + list.removeDuplicates());
        System.out.println("Ausgabe nach removeDuplicates:");
        list.print();

    }
}