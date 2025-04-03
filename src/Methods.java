public class Methods {
    public static void main(String[] args) {

        //Method - Bloco de código reutilizável que é executado quando chamado ()

        String name = "Carlos";
        int age = 24;

        felizAniversario(name, age);
        felizAniversario(name, age);
        felizAniversario(name, age);

        double result = square(3);
        System.out.println(result);

        result = cube(3);
        System.out.println(result);

        String fullName = getFullName("Carlos", "Oliveira");
        System.out.println(fullName);
    }

    static void felizAniversario(String name, int age) {
        System.out.println("Feliz aniversário!");
        System.out.printf("Feliz aniversário pra você, %s!\n", name);
        System.out.printf("Você faz %d anos hoje!\n", age);
        System.out.println("Feliz aniversário!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }
}
