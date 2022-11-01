package Praktikum_2;

public class TiereUndPflanzenTest {

    public static void main(String[] args) {

        //Grass is green
        Plant grass = new Plant();
        grass.setName("Gras");
        grass.setDescription("gruen");

        //Berry is red
        Plant berry = new Plant();
        berry.setName("Beeren");
        berry.setDescription("rot");

        //Algea is silver
        Plant algae = new Plant();
        algae.setName("Algen");
        algae.setDescription("silber");

        //Fish eats algea
        Animal fish = new Animal();
        fish.setName("Fisch");
        fish.addFood(algae);

        //Zebra eats grass
        Animal zebra = new Animal();
        zebra.setName("Zebra");
        zebra.addFood(grass);

        //Lion eats zebras
        Animal lion = new Animal();
        lion.setName("Loewe");
        lion.addFood(zebra);

        //Bear eats berries and fish
        Animal bear = new Animal();
        bear.setName("Baer");
        bear.addFood(berry);
        bear.addFood(fish);

        //Animal is carnivore, herbivore or omnivore
        System.out.println(zebra.getName() + " ist ein " + zebra.isEating());
        System.out.println(lion.getName() + " ist ein " + lion.isEating());
        System.out.println(bear.getName() + " ist ein " + bear.isEating());
    }
}
