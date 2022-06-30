package TasksDay4.HashMap;
import java.util.*;

public class ContainsKeyOrNot {
    public static void main(String[] args) {

        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");

        boolean result = hash_map.isEmpty();

        System.out.println("Is hash map empty: " + result);
        // Removing all the elements from the linked map
        hash_map.clear();
        // Check if map is empty
        result = hash_map.isEmpty();
        // Check the result
        System.out.println("Is hash map empty: " + result);
    }

}
