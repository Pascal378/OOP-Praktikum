package Praktikum_5;

public class MyList {
    private int[] array = new int[0];

    public void addToList(int index, int item) {
        int[] copyArray = new int[array.length + 1];

        if (index > array.length) {
            System.out.println("Ungültiger Index");
            return;
        }

        if (array.length == 0) {
            copyArray[0] = item;
            this.array = copyArray;
            return;
        }


        for (int i = 0; i < index; i++) {
            copyArray[i] = array[i];
        }

        copyArray[index] = item;

        for (int z = index + 1; z < copyArray.length; z++) {
            copyArray[z] = array[z - 1];
        }

        this.array = copyArray;
    }

    public void removeFromList(int index) {
        int[] copyArray = new int[array.length - 1];

        if (index > array.length) {
            System.out.println("Ungültiger Index");
            return;
        }

        if (array.length == 1) {
            array = copyArray;
            return;
        }

        for (int i = 0; i < index; i++) {
            copyArray[i] = array[i];
        }

        for (int z = index; z < copyArray.length; z++) {
            copyArray[z] = array[z + 1];
        }

        this.array = copyArray;

    }

    public int amountOfDouble() {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                amount++;
            }
        }

        return amount;
    }

    public void print() {
        System.out.println("Ausgabe: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    int removeDuplicates() {
        int[] copyArray = array;

        for (int i = 0; i < array.length; i++) {
            for (int z = 0; z < array.length; z++) {
                if (array[i] == array[z] && i != z) {
                    removeFromList(z);
                    removeDuplicates();
                }
            }
        }


        return copyArray.length - array.length;
    }

    public void sortList() {
        //Create helper variables
        int helper;


        //Check if neighbor is smaller or equal - if so then continue. If not arrange them properly in the array and start over through a recursive call of the method
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                continue;
            }
            helper = array[i];
            array[i] = array[i + 1];
            array[i + 1] = helper;
            sortList();
        }
    }

    public void kombiZahl(int zahl) {
        MyList combinations = new MyList();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                for (int z = 0; z < array.length; z++) {
                    if (array[i] + array[x] + array[z] == zahl) {
                        System.out.println(array[i] + " + " + array[x] + " + " + array[z] + " = " + zahl);
                    }
                }
            }
        }
    }

}
