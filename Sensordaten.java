import java.util.*;

public class Sensordaten {
    public static void main(String[] args){

        ArrayList<Integer> messwerte = input(); //Messwerte die der Nutzer eingibt


        System.out.println(filterMesswerte(messwerte));

    }


    //Funktion zum Einlesen der Nutzereingaben in eine Liste
    public static ArrayList<Integer> input (){

        boolean stop = false; //Check ob 3 mal 1 kam
        int counter = 0; //Zähler für aufeinander folgende Einsen

        ArrayList<Integer> messwerteS = new ArrayList<>(); //Liste in die Nutzereingaben gespeichert werden

        Scanner sc = new Scanner(System.in);

        //Solange keine 3 Einsen aufeinander folgen werden weiter Eingaben vom User angenommen. Bei 3 aufeinander folgenden Einsen wird die Schleife abgebrochen und die gefüllte Liste returned
        while(!stop){
            System.out.println("Bitte machen Sie eine Eingabe: ");
            int eingabe = sc.nextInt();

            if(eingabe == 1){
                messwerteS.add(eingabe);
                counter++;

                if(counter == 3){
                    stop = true;
                }
            } else{
                counter = 0;
                messwerteS.add(eingabe);
            }
        }

        return messwerteS;
        
    }

    public static ArrayList<Integer> filterMesswerte (ArrayList<Integer> messwerteS){

        ArrayList<Integer> werte = new ArrayList<>(messwerteS);

        int removed = 0; //Hilfsvariable um den korrekten Index zu erfassen

        //Alle positiven Werte aus der Liste entfernen
        for(int i = 0;i < messwerteS.size();i++){

            if(messwerteS.get(i) > 0){
                werte.remove(i-removed);
                removed++;
            }
        }




        //Beträge Bilden durch Multiplikation von -1 mit allen negativen Integers der Liste
        werte.replaceAll(e -> e * (-1));

        return  werte;
    }






}
