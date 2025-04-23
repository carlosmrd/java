import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {

        //Array = Coletivo de valores de um mesmo tipo

        String[] fruits = {"strawberry", "orange", "apple", "banana"};

        fruits[0] = "dragonfruit";
        int numOfFruits = fruits.length;

        Arrays.sort(fruits);
        //Arrays.fill(fruits, "strawberry");

        System.out.println(fruits[0]);
        System.out.println();

        System.out.println(numOfFruits);
        System.out.println();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
