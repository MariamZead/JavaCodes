import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap <Integer , String> myMap = new HashMap<>();
        myMap.put(20,"Mariam"); // adding element
        myMap.put(23,"Atef"); // adding element
        System.out.println("The value of key 20 is " +myMap.get(20)); // will return the value
        System.out.println("All keys : "+myMap.keySet()); // will return set contains all the keys
        System.out.println("All values : "+myMap.values()); // will return set contains all the values
        // printing the keys
        for (Integer x : myMap.keySet())
            System.out.println(x);
        // printing the values
        for (Integer x : myMap.keySet())
            System.out.println(myMap.get(x));
        // printing the item
        for (Integer x : myMap.keySet())
            System.out.println(x+ " " + myMap.get(x));
    }
}
