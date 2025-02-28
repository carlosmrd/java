import java.util.Scanner;

public class UserInput02 {

    public static void main(String[] args) {

        //Calcular a área de um retângulo

        //Declarar e iniciar variáveis
        double comprimento;
        double altura;
        double area;

        //Iniciar o scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        //Aceitar input do usuário
        System.out.print("Insira o comprimento em cm: ");
        comprimento = scanner.nextDouble();

        System.out.print("Insira a altura em cm: ");
        altura = scanner.nextDouble();

        //Calcular a área do retângulo

        area = comprimento * altura;

        //Retornar o resultado ao usuário
        System.out.println("A área do retângulo é de " + area + " cm.");

        scanner.close();
    }

}
