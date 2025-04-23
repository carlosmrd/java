import java.util.Scanner;
import java.util.Arrays;

public class JavaArraysUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of different food: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[arraySize];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        Arrays.sort(foods);

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
