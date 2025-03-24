import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {

        //EnhancedSwitches servem como alternativa para o uso de múltiplas declarações if else
        //É uma função do Java14

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Insira o dia da semana: ");
        day = scanner.nextLine();

        switch (day) {
            case "Domingo", "Sábado" ->
                System.out.println("É fim de semana.");
            case "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" ->
                System.out.println("É um dia de semana.");
            default ->
                System.out.println(day + " não é um dia.");
        }
    }
}
