public class TernaryOperator {
    public static void main(String[] args) {

        //O ternary operator ? = Retorna 1 de 2 valores se uma condição for verdadeira
        //variável = (condição) ? ifTrue : ifFalse

        /*if (score >= 60){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }*/


        int score = 70;
        String passedOrFailed = (score >= 60) ? "Passed" : "Failed";
        System.out.println(passedOrFailed);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int time = 13;
        String timeOfDay = (time < 12) ? "A.M" : "P.M.";
        System.out.println(timeOfDay);
    }
}
