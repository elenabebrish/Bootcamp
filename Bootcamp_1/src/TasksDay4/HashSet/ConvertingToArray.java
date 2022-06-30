package TasksDay4.HashSet;
import java.util.*;
public class ConvertingToArray {

    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");

        System.out.println("Original Hash Set: " + h_set);
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);

        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);
        }
    }
}
