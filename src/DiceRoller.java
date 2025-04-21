import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int quantidadeDados;
        int total = 0;

        System.out.print("Insira a quantidade de dados a serem jogados: ");
        quantidadeDados = scanner.nextInt();

        if (quantidadeDados > 0) {
            for (int i = 0; i < quantidadeDados; i++) {
                int rolagemDado = random.nextInt(1, 7);
                total += rolagemDado;
                System.out.println("Você rolou um " + rolagemDado + ".");
                printDado(rolagemDado);
            }
            System.out.println("Total: " + total + ".");
        } else {
            System.out.println("A quantidade de dados deve ser no mínimo 1.");
        }

        scanner.close();
    }

    static void printDado(int rolagemDado) {

        String dado1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dado2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dado3 = """

                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dado4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dado5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dado6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (rolagemDado) {
            case 1 -> System.out.print(dado1);
            case 2 -> System.out.print(dado2);
            case 3 -> System.out.print(dado3);
            case 4 -> System.out.print(dado4);
            case 5 -> System.out.print(dado5);
            case 6 -> System.out.print(dado6);
            default -> System.out.println("Rolagem inválida.");
        }
    }
}
