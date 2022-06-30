package TasksDay4.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;
public class Comparing {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Black");
        System.out.println("Free Tree set: " + set1);

        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Red");
        set2.add("Pink");
        set2.add("Black");

        System.out.println("Second Tree set: " + set2);

        TreeSet<String> result = new TreeSet<String>();
        for (String element : set1){
            System.out.println(set2.contains(element) ? "Yes" : "No");
        }

    }

}
