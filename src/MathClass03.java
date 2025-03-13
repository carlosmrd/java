import java.util.Scanner;

public class MathClass03 {
    public static void main(String[] args) {

        //Cálculo de circunferência, área e volume de um círculo.

        Scanner scanner = new Scanner(System.in);

        double raio;
        double circunferencia;
        double area;
        double volume;

        while (true) {
            System.out.print("Insira o raio do círculo em cm: ");
            if (scanner.hasNextDouble()) {
                raio = scanner.nextDouble();
                break;
            } else {
                System.out.println("Dados inválidos, por favor, insira o valor em número.");
                scanner.next();
            }
        }

        circunferencia = (2 * Math.PI * raio);
        area = (Math.PI * Math.pow(raio, 2));
        volume = ((4.0 / 3.0) * Math.PI * Math.pow(raio, 3));

        System.out.printf("A circunferência do círculo é de %.1fcm.\n" , circunferencia);
        System.out.printf("A area do círculo é de %.1fcm².\n" , area);
        System.out.printf("O volume do círculo é de %.1fcm³.\n" , volume);

        scanner.close();
    }
}
