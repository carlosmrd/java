import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Declarar variáveis

        double weight;
        double newWeight;
        int choice;

        //Mensagem inicial
        System.out.println("Programa para conversão de peso");

        //Prompt para a escolha do usuário
        System.out.println("1 - lbs para kgs");
        System.out.println("2 - kgs para lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        //Opção 1, lbs pra kgs
        if (choice == 1){
            System.out.print("Insira o peso em lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("O peso em kgs é igual a: %.2f.", newWeight);
        } else if (choice == 2){
            System.out.print("Insira o peso em kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("O peso em lbs é igual a: %.2f.", newWeight);
        } else {
            System.out.println("Opção inválida, insira um valor entre 1 e 2.");
        }

        scanner.close();
    }
}
