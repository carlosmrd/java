import java.util.Scanner;

public class UserInput01 {

    public static void main(String[] args) {

        //Scanners permitem que o usuário entre com dados em java. É necessário importar o scanner no início do código para utilizar
        //Nome da classe - Nome do objeto
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int ageScanner = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudentScanner = scanner.nextBoolean();

        System.out.println("Hello, " + name + ".");
        System.out.println("You are " + ageScanner + " years old.");
        System.out.println("Your GPA is " + gpa + ".");

        if (isStudentScanner) {
            System.out.println("You are enrolled as a student.");
        } else {
            System.out.println("You are not enrolled as a student.");
        }

        //Existe um problema comum ao aceitar um valor qualquer com o Scanner e em seguida aceitar um segundo valor como string
        //Uma solução é inserir um scanner.nextLine(); após aceitar o primeiro valor, assim o caractere /n não será registrado pelo scanner seguinte
        System.out.print("Enter your age: ");
        int ageScanner2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + ageScanner2 + " years old.");
        System.out.println("You like the color " + color + ".");

        scanner.close();

    }

}
