import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //Criação do objeto aleatório
        Random random = new Random();

        //Declaração da variável
        int number1;
        int number2;
        int number3;

        //Atribuição do objeto aleatório à variável. O primeiro valor é inclusivo e o terceiro exclusivo.
        number1 = random.nextInt(1, 21);
        number2 = random.nextInt(1, 21);
        number3 = random.nextInt(1, 21);

        System.out.println(number1 + ", " + number2 + ", " + number3 + ".");

        //A lógica também pode ser usada para doubles.
        double numberDouble;

        //Por padrão será gerado um double entre 0 e 1, mas o origin e bound também podem ser usados.
        numberDouble = random.nextDouble();

        System.out.println(numberDouble + ".");

        //A lógica também pode ser usada para booleans.
        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads){
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
