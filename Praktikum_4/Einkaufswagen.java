package Praktikum_4;

import java.util.ArrayList;
import java.util.List;

public class Einkaufswagen {
    private List<String> cart = new ArrayList<>();

    public void addToCart(String item) {
        if (cart.size() < 5) {
            cart.add(item);
        } else {
            System.out.println("Einkaufswagen voll. Es ist maximal Platz fuer 5 Artikel.");
        }
    }

    public void removeFromCart(String item) {
        cart.remove(item);
    }

    public void showContent() {
        System.out.println("Ihr Einkaufswagen beinhaltet:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
    }

    public int size() {
        return cart.size();
    }
}
