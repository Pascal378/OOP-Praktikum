package Praktikum_11;

public class StackTest {


    public static void main(String[] args) {
        StackAdapter<String> adapter = new MyStack<>();

        System.out.println(adapter.empty());
        System.out.println(adapter.push("Hallo"));
        System.out.println(adapter.push("Wie"));
        System.out.println(adapter.push("Gehts"));
        System.out.println(adapter.empty());
        System.out.println(adapter.pop());
        System.out.println(adapter.peek());
        System.out.println(adapter.pop());
        System.out.println(adapter.empty());
        System.out.println(adapter.pop());
        System.out.println(adapter.peek());
    }
}
