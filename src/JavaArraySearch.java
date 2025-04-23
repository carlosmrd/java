public class JavaArraySearch {
    public static void main(String[] args) {

        int [] numbers = {1, 6, 5, 2, 3, 9};
        int target = 7;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array.");
        }
    }
}
