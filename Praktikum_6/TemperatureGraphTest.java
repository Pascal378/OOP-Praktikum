package Praktikum_6;

public class TemperatureGraphTest {
    public static void main(String[] args) {
        TemperatureGraph graph = new TemperatureGraph(2022);

        graph.addTemperatur(1, 5);
        graph.addTemperatur(2, 9);
        graph.addTemperatur(3, 16);
        graph.addTemperatur(4, 13);
        graph.addTemperatur(5, 11);
        graph.addTemperatur(6, 20);
        graph.addTemperatur(7, 25);
        graph.addTemperatur(8, 23);
        graph.addTemperatur(9, 20);
        graph.addTemperatur(10, 18);
        graph.addTemperatur(11, 11);
        graph.addTemperatur(12, 8);

        graph.plotGraph();

    }
}
