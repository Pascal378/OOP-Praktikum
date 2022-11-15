package Praktikum_4;

public class MemoryTest {
    public static void main(String[] args) {

        //Create object
        Memory memory = new Memory();

        //Print tests
        System.out.println("Test 1:");
        memory.printField(memory.generateField(4));
        
        System.out.println("\n" + "Test 2:");
        memory.printField(memory.generateField(6));


    }
}

