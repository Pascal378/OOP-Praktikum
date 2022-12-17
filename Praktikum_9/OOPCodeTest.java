package Praktikum_9;

public class OOPCodeTest {
    public static void main(String[] args) {
        boolean[][] test = {{false, false, false}, {false, true, false}, {false, false, true}};

        OOPCode code = new OOPCode(test);

        System.out.println("Zahlenbild:");
        code.printNumbers();
        System.out.println("");
        System.out.println("Code: " + code.getCode());
        code.print();
        System.out.println("");
        System.out.println("Code: " + code.getCode());
        System.out.println(code.getRotation() + ". :");
        code.rotate();
        code.print();
        System.out.println("");
        System.out.println("Code: " + code.getCode());
        System.out.println(code.getRotation() + ". :");
        code.rotate();
        code.print();
        System.out.println("");
        System.out.println("Code: " + code.getCode());
        System.out.println(code.getRotation() + ". :");
        code.rotate();
        code.print();


        System.out.print("");
        System.out.print("");
        System.out.println("Maximaler Code");
        code.maxCode();
    }
}
