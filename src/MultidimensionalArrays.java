public class MultidimensionalArrays {
    public static void main(String[] args) {

        //2DArray = Array em que cada elemento é um array

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        for (String[] types : groceries) {
            for (String foods : types) {
                System.out.print(foods + " ");
            }
            System.out.println();
        }
        System.out.println();

        groceries[0][0] = "pineapple";

        groceries[1][2] = "celery";

        for (String[] types : groceries) {
            for (String foods : types) {
                System.out.print(foods + " ");
            }
            System.out.println();
        }
        System.out.println();

        char[][] telephone = {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for (char[] rows : telephone) {
            for (char keys : rows) {
                System.out.print(keys + " ");
            }
            System.out.println();
        }
    }
}
