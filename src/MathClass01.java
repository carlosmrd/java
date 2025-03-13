public class MathClass01 {
    public static void main(String[] args) {

        //Constante do valor de pi
        System.out.println(Math.PI);
        //Constante de Euler
        System.out.println(Math.E);

        double result;

        //Função para cálculo de potência
        result = Math.pow(2, 4);
        System.out.println(result);

        //Função para valor absoluto
        result = Math.abs(-8);
        System.out.println(result);

        //Função para raiz quadrada
        result = Math.sqrt(9);
        System.out.println(result);

        //Arredondamento (Para o número inteiro mais próximo)
        result = Math.round(3.9);
        System.out.println(result);

        //Arredondamento (Para o número inteiro acima)
        result = Math.ceil(3.1);
        System.out.println(result);

        //Arredondamento (Para o número inteiro abaixo)
        result = Math.floor(3.9);
        System.out.println(result);

        //Máximo entre dois valores
        result = Math.max(10,20);
        System.out.println(result);

        //Mínimo entre dois valores
        result = Math.min(10,20);
        System.out.println(result);
    }
}
