package Praktikum_7;

public class PasswortTest {

    public static void main(String[] args) {
        PasswortGenerator generator = new PasswortGenerator();

        generator.erstellePasswort("java ist eine objekt-orientierte sprache!");
        System.out.println(generator.getPassword());
        generator.erstellePasswort("Java ist auch eine Insel (von Christian Ullenboom");
        System.out.println(generator.getPassword());
    }


}
