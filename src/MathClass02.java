import java.util.Scanner;

public class MathClass02 {
    public static void main(String[] args) {

        //Exercício 01 - Hipotenusa de um triângulo

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        while (true) {
            System.out.println("Insira o tamanho em cm do lado A: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                break;
            } else {
                System.out.println("Dados inválidos, por favor, insira o valor em número.");
                scanner.next();
            }
        }

        while (true) {
            System.out.println("Insira o tamanho em cm do lado B: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
                break;
            } else {
                System.out.println("Dados inválidos, por favor, insira o valor em número.");
                scanner.next();
            }
        }

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("O tamanho da hipotenusa é " + c + " cm.");

        scanner.close();
    }
}
