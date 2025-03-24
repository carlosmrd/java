import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        while (true) {
            System.out.print("Insira a temperatura: ");
            if (scanner.hasNextDouble()) {
                temp = scanner.nextDouble();
                break;
            } else {
                System.out.println("Valor inválido, por favor insira somente números.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Converter para Celsius ou Fahrenheit? (C ou F): ");
            if (scanner.hasNext()) {
                unit = scanner.next().toUpperCase();
                if (unit.equals("C") || unit.equals("F")) {
                    break;
                } else {
                    System.out.println("Valor inválido, por favor insira somente C ou F.");
                }
            } else {
                System.out.println("Valor inválido, por favor insira somente C ou F.");
            }
        }

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("A temperatura convertida é de: %.0f°", newTemp);

        scanner.close();
    }
}