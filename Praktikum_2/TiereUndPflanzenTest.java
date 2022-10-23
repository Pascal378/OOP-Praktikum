package Praktikum_2;

public class TiereUndPflanzenTest {

    public static void main(String[] args) {


        Plant grass = new Plant();
        grass.setName("Gras");
        grass.setDescription(" ist gruen");

        Plant berry = new Plant();
        berry.setName("Beeren");
        berry.setDescription(" sind rot.");

        Plant algae = new Plant();
        algae.setName("Algen");
        berry.setDescription(" sind silber");

        Animal fish = new Animal();
        fish.setName("Fisch");

        Animal zebra = new Animal();
        zebra.setName("Zebra");
        zebra.addFood(grass);

        Animal lion = new Animal();
        lion.setName("Loewe");
        lion.addFood(zebra);

        Animal bear = new Animal();
        bear.setName("Baer");
        bear.addFood(berry);
        bear.addFood(fish);


        System.out.println(zebra.getName() + " ist ein " + zebra.isEating());
        System.out.println(lion.getName() + " ist ein " + lion.isEating());
        System.out.println(bear.getName() + " ist ein " + bear.isEating());
    }
}
