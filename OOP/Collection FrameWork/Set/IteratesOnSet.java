import java.util.*;

public class Sets {
    public static void main(String[] args) {
       HashSet <String> words = new HashSet<>();
        words.add("Mariam");
        words.add("Omar");
        words.add("Mohamed");
        words.add("Asiyah");
        System.out.println(words); // [Mohamed, Mai, Mariam, Asiyah]

        // set Iterator
        Iterator <String> newData = words.iterator();
        System.out.println("Set words is ");
        // Iterate the hash set
        while (newData.hasNext()) {
            System.out.print(newData.next()+ " "); // Mohamed Mai Mariam Asiyah
        }

        // ***************************
        // iterates with for-each
        System.out.println();
        for (String word : words)
            System.out.print(word + " ");

    }
}
