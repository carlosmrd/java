public class VariableScope {

    //Variável da classe
    static int x = 3;

    public static void main(String[] args) {

        //Variable Scope é onde uma variável pode ser acessada

        //Variável local
        int x = 1;
        System.out.println(x);
    }

    static void doSomething() {
        //Variável local
        int x = 2;
        System.out.println(x);
    }
}
