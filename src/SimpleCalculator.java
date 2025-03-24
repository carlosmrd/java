import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Insira o primeiro valor: ");
        num1 = scanner.nextDouble();

        System.out.print("Insira um operador (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Insira o segundo valor: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por 0!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println(operator + " não é um operador válido.");
                validOperation = false;
            }

        }

        if (validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }
}
