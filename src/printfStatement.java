public class printfStatement {
    public static void main(String[] args) {

        //printf é a função usada para formatar output
        //%[flags][width][.precision][specifier-character]
        //https://www.w3schools.com/java/ref_output_printf.asp

        String nome = "Aglaea";
        char primeiraLetra = 'A';
        int idade = 30;
        double altura = 1.70;
        boolean isDemigod = true;

        System.out.printf("Hello, %s.\n", nome);
        System.out.printf("Your name starts with a %c.\n", primeiraLetra);
        System.out.printf("You are %d years old.\n", idade);
        System.out.printf("You are %.2f cm tall.\n", altura);
        System.out.printf("Demigod: %b.\n", isDemigod);
        System.out.println();
        System.out.printf("%s is %d years old and %.2f cm tall.\n", nome, idade, altura);
        System.out.println();

        //flags
        double price1 = 9.99;
        double price2 = 10000.15;
        double price3 = -54.01;

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.println();

        // [width]
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        System.out.printf("%4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%4d\n", id4);
    }
}
