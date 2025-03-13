import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double finalAmount;

        while (true) {
            System.out.print("Enter the principal amount: ");
            if (scanner.hasNextDouble()) {
                principal = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input, please use only numbers.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter the interest rate (in %): ");
            if (scanner.hasNextDouble()) {
                rate = scanner.nextDouble() / 100;
                break;
            } else {
                System.out.println("Invalid input, please use only numbers.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter the number of times compounded per year: ");
            if (scanner.hasNextInt()) {
                timesCompounded = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input, please use only numbers.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter the number of years: ");
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input, please use only numbers.");
                scanner.next();
            }
        }

        finalAmount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The final amount, after %d year(s), will be %.2f$.", years, finalAmount);

        scanner.close();
    }
}
