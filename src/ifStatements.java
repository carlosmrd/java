import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        //Declarações if rodam um bloco de código case sua condição seja verdadeira

        //Declaração de variável
        String name;
        int age;
        Boolean isStudent;

        //Iníciar o Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        //Aceitar input do usuário
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Insira sua idade: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? ");
        isStudent = scanner.nextBoolean();
        
        //Declarações if, else if e else

        //name
        if (name.isEmpty()){
            System.out.println("You didn't enter your name.");
        } else {
            System.out.println("Hello, " + name + ".");
        }

        //age
        if(age >= 60){
            System.out.println("You are a senior.");
        } else if (age >= 18) {
            System.out.println("You are an adult!.");
        } else if (age < 0) {
            System.out.println("You haven't been born yet.");
        } else if (age == 0) {
            System.out.println("You have just been born.");
        } else {
            System.out.println("You are not an adult.");
        }

        //isStudent
        if (isStudent){
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        //Fechar o scanner
        scanner.close();
    }
}
