import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {

        //.substring() é um método usado para extrair parte de uma string.
        //string.substring(start, end)
        //String username = email.substring(0, 14);
        //String domain = email.substring(15);

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        while (true) {
            System.out.print("Insira seu email: ");
            if (scanner.hasNextLine()) {
                email = scanner.nextLine();
                if (email.contains("@")) {
                    break;
                } else {
                    System.out.println("O endereço de email é inválido, por favor insira novamente.");
                }
            } else {
                System.out.println("O endereço de email é inválido, por favor insira novamente.");
            }
        }

        username = email.substring(0, email.indexOf("@"));
        System.out.printf("Seu nome de usuário é %s.\n", username);
        domain = email.substring(email.indexOf("@") + 1);
        System.out.printf("O domínio do seu endereço de email é %s.\n", domain);

        scanner.close();
    }
}
