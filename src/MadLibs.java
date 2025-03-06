import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        //Jogo de Mad Libs

        //Criação do scanner

        Scanner scanner = new Scanner(System.in);

        //Declaração das variáveis

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        //Uso do scanner para iniciar as variáveis

        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter an noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter an verb: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        //Retorno para o usuário

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        //Encerramento do scanner

        scanner.close();
    }
}
