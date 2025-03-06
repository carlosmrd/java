public class Arithmetic {
    public static void main(String[] args) {

        //Operações aritméticas

        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;

        //O uso de % retorna a sobra de uma divisão.
        z = x % y;

        System.out.println(z);

        //Operadores de atribuição ampliada

        x = 10;
        y = 2;

        //As duas linhas abaixo tem a mesma função. O uso de += faz que o valor de uma variável seja usado na operação com outro valor.
        //x = x + y;
        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        x %= y;

        System.out.println(x);

        //Operadores de incremento e decremento

        x = 1;

        //O uso de ++ incrementa o valor da variável em 1. A lógica é aplicável a subtração.
        x++;
        x++;
        x++;

        x--;
        x--;

        System.out.println(x);

        //Ordem das operações

        //No caso de múltiplas operações, elas são executadas na seguinte ordem: parênteses, exponenciais, multiplicações, divisões, somas, subtrações.
        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}
