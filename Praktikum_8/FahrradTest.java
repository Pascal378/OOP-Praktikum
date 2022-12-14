package Praktikum_8;

public class FahrradTest {
    public static void main(String[] args) {
        Fahrrad first = new Fahrrad(40);
        Fahrrad second = new Fahrrad(20);
        Fahrrad third = new Fahrrad(30);
        Fahrrad fourth = new Fahrrad(35);

        FahrradGruppe group = new FahrradGruppe();

        group.addFahrrad(third);
        group.addFahrrad(second);
        group.addFahrrad(first);
        group.addFahrrad(fourth);

        System.out.println("Werte vor addLadung:");
        System.out.println("\nReisegeschwindigkeit: " + group.reisegeschwindigkeit());
        System.out.println("Fahhrad 1: " + first.speed());
        System.out.println("Fahhrad 2: " + second.speed());
        System.out.println("Fahhrad 3: " + third.speed());
        System.out.println("Fahhrad 4: " + fourth.speed());

        group.addLadung(91);

        System.out.println("\nWerte nach addLadung:");
        System.out.println("\nReisegeschwindigkeit: " + group.reisegeschwindigkeit());
        System.out.println("Fahhrad 1: " + first.speed());
        System.out.println("Fahhrad 2: " + second.speed());
        System.out.println("Fahhrad 3: " + third.speed());
        System.out.println("Fahhrad 4: " + fourth.speed());

    }

}
