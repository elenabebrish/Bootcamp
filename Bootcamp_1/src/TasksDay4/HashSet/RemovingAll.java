package TasksDay4.HashSet;
import java.util.*;

public class RemovingAll {
    public static void main(String[] args) {

    HashSet<String> h_set = new HashSet<String>();

          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");

    System.out.println("Original Hash Set: " + h_set);
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements " + h_set);
    }
}
