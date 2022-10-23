package Praktikum_2;

public class Animal extends Entity {
    private String carnivore = "-";
    private String herbivore = "-";

    public String isEating() {

        if (carnivore == "-") {
            return "Pflanzenfresser";
        }
        if (herbivore == "-") {
            return "Fleischfresser";
        } else {
            return "Allesfresser";
        }
    }

    public void addFood(Animal food) {
        carnivore = food.getName();
    }

    public void addFood(Plant food) {
        herbivore = food.getName();
    }
}
