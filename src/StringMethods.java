public class StringMethods {
    public static void main(String[] args) {

        String name = "   Carlos Oliveira   ";

        //Length
        int length = name.length();
        System.out.println(length);

        //charAt
        char letter = name.charAt(5);
        System.out.println(letter);

        //Index
        int index = name.indexOf("O");
        System.out.println(index);

        //Last Index
        int lastIndex = name.lastIndexOf("a");
        System.out.println(lastIndex);

        //Trim
        name = name.trim();
        System.out.println(name);

        //To Upper Case
        name = name.toUpperCase();
        System.out.println(name);

        //To Lower Case
        name = name.toLowerCase();
        System.out.println(name);

        //Replace
        name = name.replace("a", "o");
        System.out.println(name);

        //isEmpty
        System.out.println(name.isEmpty());

        //Contains (Case sensitive)
        System.out.println(name.contains("c"));

        name = "Carlos Oliveira";

        //Equals
        System.out.println(name.equals("Carlos Oliveira"));
    }
}
