import java.util.ArrayList;

public class Week5 {
    public static void main(String[] args) {
        // Chapitre 20 : String (traitements)
        String s1 = "abcxyz";

        int length = s1.length();
        char c1 = s1.charAt(0);
        char c2 = s1.charAt(1);
        int i = s1.indexOf('x');

        System.out.println(length);
        System.out.println(c1 + " " + c2);
        System.out.println(i);

        String underscores = "Hello_World";
        String whitespaces = underscores.replace("_", " ");

        String world = underscores.substring(6, 11);

        System.out.println(whitespaces);
        System.out.println(world);


        // Chapitre 21 : Tableaux dynamiques
        ArrayList<String> allStrings = new ArrayList<>();

        allStrings.add(underscores);
        allStrings.add(whitespaces);
        allStrings.add(world);

        int size = allStrings.size();
        String second = allStrings.get(1);
        boolean empty = allStrings.isEmpty();
        allStrings.set(0, "Goodbye");

        allStrings.remove(2);
        allStrings.clear();

        System.out.println(size);
        System.out.println(second);
        System.out.println(empty);
    }
}
