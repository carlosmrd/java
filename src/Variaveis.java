public class Variaveis {

    public static void main(String[] args){

        //É assim que comentários funcionam
        /*E é assim
        que comentários
        multilinha funcionam*/

        System.out.println("Hello, World");
        System.out.println("I like Aglaea, she's really pretty!");
        System.out.println("I want to pull for E2");

        //Digitar sout gera automaticamente a linha abaixo.
        System.out.println();

        //Intergers são variáveis que correspondem a números inteiros
        //Declaração de interger - Nome da variável - Valor da variável

        int age = 24;
        int year = 2025;
        int quantity = 1;
        System.out.println("My age is " + age);
        System.out.println("The year is " + year);
        System.out.println("The quantity of products is " + quantity);

        //Doubles são variáveis que correspondem a números com porções decimais
        //Declaração de double - Nome da variável - Valor da variável

        double price = 19.99;
        double score = 7.5;
        double temperature = 21.8;

        System.out.println("O valor é de R$" + price);
        System.out.println("A pontuação na prova foi " + score);
        System.out.println("Agora fazem " + temperature + "°C");

        //Chars são variáveis que correspondem a caracteres
        //Declaração de char - Nome da variável - Valor da variável

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("Sua nota é " + grade);
        System.out.println("Firefly" + symbol);
        System.out.println("Esse é um cifrão: " + currency);

        //Booleans são variáveis que correspondem a verdadeiro ou falso
        //Declaração de boolean - Nome da variável - Valor da variável

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        //Booleans são normalmente usadas para declarações if

        if(isStudent) {
            System.out.println("Você é um estudante!");
        } else {
            System.out.println("Você não é um estudante.");
        }

        //Strings são variáveis que correspondem a texto
        //Declaração de String - Nome da variável - Valor da variável

        String name1 = "Aglaea";
        String name2 = "Firefly";
        System.out.println(name1);

        //O uso de duas strings em conjunto se chama concatenação de strings

        System.out.println("Minhas personagens favorita são " + name1 + " e " + name2);

        //Números podem ser usados dentro de strings, mas não são usados para operações matemáticas dessa forma
        String email = "fakeemail123@gmail.com";
        System.out.println("Seu email é " + email);
    }

}