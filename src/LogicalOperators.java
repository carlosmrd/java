import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        //&& = AND
        //|| = OR
        //! = NOT

        /*double temp = 20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("O clima está bom.");
            System.out.println("Faz sol lá fora.");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("O clima está bom.");
            System.out.println("Está nublado lá fora.");
        }*/

        Scanner scanner = new Scanner(System.in);

        //Nome de usuário deve conter entre 4-12 caracteres
        //Nome de usuário não deve conter espaço ou underline

        String username;

        System.out.print("Insira o nome de usuário: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Nome de usuário deve ter entre 4 e 12 caracteres.");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Nome de usuário não deve conter espaço ou underline.");
        } else {
            System.out.println("Bem vindo, " + username + ".");
        }

        scanner.close();
    }
}
