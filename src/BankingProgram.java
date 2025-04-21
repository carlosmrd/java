import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double saldo = 0;
        boolean emExecucao = true;
        int opcao;

        while (emExecucao) {
            System.out.println("Programa Bancário\n");
            System.out.println("\t1 - Exibir Saldo");
            System.out.println("\t2 - Efetuar Deposito");
            System.out.println("\t3 - Efetuar Saque");
            System.out.println("\t4 - Finalizar Operações.\n");

            System.out.print("Escolha a operação desejada (1-4): ");
            opcao = scanner.nextInt();

            System.out.println();

            switch (opcao) {
                case 1 -> {
                    exibirSaldo(saldo);
                    System.out.println();
                }
                case 2 -> {
                    saldo += deposito();
                    System.out.println();
                }
                case 3 -> {
                    saldo -= saque(saldo);
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Encerrando.");
                    emExecucao = false;
                }
                default -> {
                    System.out.println("Opção inválida");
                    System.out.println();
                }
            }
        }
        scanner.close();
    }

    static void exibirSaldo(double saldo) {

        System.out.println("Seu saldo é de: ");
        System.out.printf("R$%.2f\n", saldo);
    }

    static double deposito() {

        double valor;

        System.out.print("Insira o valor do depósito: R$");
        valor = scanner.nextDouble();

        if (valor < 0) {
            System.out.println("O valor não pode ser negativo.");
            return 0;
        } else {
            return valor;
        }
    }

    static double saque(double saldo) {

        double valor;

        System.out.print("Insira o valor do saque: R$");
        valor = scanner.nextDouble();

        if (valor < 0) {
            System.out.println("O valor não pode ser negativo.");
            return 0;
        } else if (valor > saldo){
            System.out.println("Saldo insuficiente.");
            return 0;
        } else {
            return valor;
        }
    }
}
