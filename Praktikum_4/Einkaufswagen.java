package Praktikum_4;

import java.util.ArrayList;

public class Einkaufswagen {
    private ArrayList<String> cart = new ArrayList<>();

    //Add item to cart
    public void addToCart(String item) {
        if (cart.size() < 5) {
            cart.add(item);
        } else {
            System.out.println("Einkaufswagen voll. Es ist maximal Platz fuer 5 Artikel.");
        }
    }

    //Remove item from list if existent
    public void removeFromCart(String item) {
        if (isInCart(item)) {
            cart.remove(item);
        }

    }

    //Check if item is existent in cart
    public boolean isInCart(String item) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) == item) {
                return true;
            }
        }

        return false;
    }

    //Show content of cart
    public void showContent() {
        System.out.println("Ihr Einkaufswagen beinhaltet:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
    }

    //Return amount of products that has been put into the cart
    public int size() {
        return cart.size();
    }
}
