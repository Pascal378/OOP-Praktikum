package Praktikum_5;

public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.addToList(0, 1);
        list.addToList(1, 1);
        list.addToList(2, 1);
        list.addToList(3, 4);
        list.addToList(4, 5);
        list.addToList(5, 6);
        list.addToList(6, 7);
        list.addToList(7, 8);
        list.addToList(8, 2);
        list.addToList(9, 3);
        list.addToList(10, 1);
        list.addToList(11, 9);
        list.addToList(12, 10);
        list.print();
        System.out.println(list.removeDuplicates());
        list.print();
        list.kombiZahl(8);


    }
}
