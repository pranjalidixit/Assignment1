import java.util.*;

public class conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minFahrenheit = scanner.nextInt();
        int maxFahrenheit = scanner.nextInt();
        int step = scanner.nextInt();

        printCelsiusConversions(minFahrenheit, maxFahrenheit, step);

        scanner.close();
    }

    public static void printCelsiusConversions(int minFahrenheit, int maxFahrenheit, int step) {
        for (int fahrenheit = minFahrenheit; fahrenheit <= maxFahrenheit; fahrenheit += step) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println(fahrenheit + " " + (int) celsius);
        }
    }
}
