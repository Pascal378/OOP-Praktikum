package Praktikum_7;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;


public class Bild {
    String format;
    int width;
    int height;
    int brightness;
    int[][] data;


    public void leseBild(String dateiName) {
        Path path = Paths.get(dateiName);

        List<String> lines;

        if (Files.exists(path)) {
            System.out.println("Datei vorhanden.");
        } else {
            System.out.println("Datei existiert nicht.");
            return;
        }
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Print Stack Trace:\r");
            e.printStackTrace();
            return;
        }

        this.format = lines.get(0);
        this.width = Integer.parseInt(lines.get(1).split(" ")[0]);
        this.height = Integer.parseInt(lines.get(1).split(" ")[1]);
        this.brightness = Integer.parseInt(lines.get(2));

        this.data = new int[this.height][this.width];

        for (int i = 0; i < data.length; i++) {
            String[] current = lines.get(i + 3).split("\\s+");
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = Integer.parseInt(current[j]);
            }
        }
    }

    public void rotiereBild() {
        int[][] newData = new int[this.data[0].length][this.data.length];

        for (int i = 0; i < newData.length; i++) {
            for (int j = 0; j < newData[0].length; j++) {
                newData[i][j] = this.data[j][i];
            }
        }

        int tmp = this.width;
        this.width = this.height;
        this.height = tmp;
        this.data = newData;
    }

    public String dataAsString() {
        String finished = "";

        for (int i = 0; i < data.length; i++) {

            finished += String.valueOf(data[i][0]);
            if (data[i][1] > 9) finished += " ";
            else finished += "  ";

            for (int j = 1; j < data[0].length; j++) {
                finished += String.valueOf(data[i][j]);
                if (data[i][j] >= 10) finished += " ";
                else finished += "  ";
            }

            finished += "\n";
        }

        return finished;
    }

    public void schreibeBild(String verzeichnis) {
        LocalDate date = LocalDate.now();
        Path path = Paths.get(verzeichnis, date + ".pgm");


        try {
            Files.writeString(path, format + " \n" + String.valueOf(width) + " " + String.valueOf(height) + "\n" + String.valueOf(brightness) + "\n" + dataAsString());
        } catch (IOException e) {
            System.out.println("Print Stack Trace:\r");
            e.printStackTrace();
        }


    }
}
