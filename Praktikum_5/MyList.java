package Praktikum_5;

public class MyList {
    private int[] array = new int[0];

    public void addToList(int index, int item) {
        //Create an array that has space for one more item
        int[] copyArray = new int[array.length + 1];

        //Check if index is correct
        if (index > array.length || index < 0) {
            System.out.println("Ungültiger Index");
            return;
        }

        //Check if list length is zero
        if (array.length == 0) {
            copyArray[0] = item;
            this.array = copyArray;
            return;
        }

        //Copy all the items that come before the index of the item we want to add
        for (int i = 0; i < index; i++) {
            copyArray[i] = array[i];
        }

        //Add item at desired index
        copyArray[index] = item;

        //Copy all items that have to come after the new added item - Start at index + 1 because we added one more item before
        for (int z = index + 1; z < copyArray.length; z++) {
            //z is the index of the new array - we copy the content from the olds array index minus 1 because we have one item more now
            copyArray[z] = array[z - 1];
        }

        this.array = copyArray;
    }

    //Remove item at specific index from list
    public void removeFromList(int index) {
        //Create an array that has 1 index less
        int[] copyArray = new int[array.length - 1];

        //Check if index is correct
        if (index > array.length || index < 0) {
            System.out.println("Ungültiger Index");
            return;
        }

        //Check if list hast only one element
        if (array.length == 1) {
            array = copyArray;
            return;
        }

        //Copy everything from the old array into the new array without the deleted item
        for (int i = 0; i < index; i++) {
            copyArray[i] = array[i];
        }

        for (int z = index; z < copyArray.length; z++) {
            copyArray[z] = array[z + 1];
        }

        this.array = copyArray;

    }

    //Print the array
    public void print() {
        System.out.println("Ausgabe: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }

    //Remove duplicates in array
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

    //Sort the list
    public void sortList() {
        int tmp = 0;

        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int x = i; x < array.length; x++) {
                if (array[x] < array[min]) min = x;
            }

            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;

        }
    }

    //Sort a specific array
    public int[] sortList(int[] array) {
        int tmp = 0;

        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int x = i; x < array.length; x++) {
                if (array[x] < array[min]) min = x;
            }

            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;

        }

        return array;
    }


    //Get unique triplets of numbers that are summed up equal to a given number
    public void kombiZahl(int zahl) {

        //Create a string array to store in the found indexes + a counter variable to loop through it
        String[] kombi = new String[array.length * array.length * array.length];
        int stringCounter = 0;

        //Store indexes temporarily
        int[] helper = new int[3];


        //Iterate through permutations
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                for (int z = 0; z < array.length; z++) {

                    if (x == y || y == z || x == z) {
                        continue;
                    }

                    //If numbers are (summed up) equal to the given number
                    if (array[x] + array[y] + array[z] == zahl) {
                        //Save them into the helper array
                        helper[0] = x;
                        helper[1] = y;
                        helper[2] = z;

                        //Sort the helper array to check them easier later
                        helper = sortList(helper);


                        //Form a string out of the sorted indexes
                        String temp = "" + helper[0] + helper[1] + helper[2];

                        //Needed later to check if the combination is already added
                        boolean stringCheck = false;
                        //Iterate through the kombi string and check if combination is already in there
                        for (int check = 0; check < kombi.length; check++) {
                            if (temp.equals(kombi[check])) {
                                stringCheck = true;
                                System.out.print("" + temp + "\n");
                            }
                        }

                        //If there isn't add it to the array
                        if (!stringCheck) {
                            kombi[stringCounter] = temp;
                            stringCounter++;
                            stringCheck = false;
                        }
                    }
                }
            }
        }

        //Print the found numbers
        for (String combination :
                kombi) {
            //As soon as null appears the end of the list is reached - so we can stop
            if (combination == null) {
                continue;
            }

            //Get the number of the given index and print it
            for (int i = 0; i < 3; i++) {
                System.out.print(array[(int) combination.charAt(i) - '0']);
                if (i < 2) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = " + zahl);
                }
            }
            System.out.print("- Indices: " + combination + "\n");
        }

    }
}

