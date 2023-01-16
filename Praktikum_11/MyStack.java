package Praktikum_11;

import java.util.ArrayList;

public class MyStack<T> implements StackAdapter<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    //Return true if list is empty - return false if not
    @Override
    public boolean empty() {
        if (stackList.isEmpty()) return true;
        return false;
    }

    //Add item to the list - then return the object
    @Override
    public T push(T item) {
        stackList.add(item);
        return item;
    }

    //Remove an item from the list and then return the item back - throws RuntimeException if list is empty
    @Override
    public T pop() {
        if (empty()) {
            throw new RuntimeException();
        }

        T item = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        return item;
    }

    //Get the last element of the list - throws RuntimeException if list is empty
    @Override
    public T peek() {
        if (empty()) throw new RuntimeException();
        return stackList.get(stackList.size() - 1);
    }
}
