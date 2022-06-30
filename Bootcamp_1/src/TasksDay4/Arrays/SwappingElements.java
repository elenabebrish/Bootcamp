package TasksDay4.Arrays;

import java.util.*;
public class SwappingElements {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<String>();
        letters.add("K");
        letters.add("B");
        letters.add("O");
        letters.add("N");

        System.out.println("Array list before swap: ");
        for (String before : letters) {
            System.out.println(before);
        }
        Collections.swap(letters, 0, 2);
        System.out.println("Array list after swap: ");
        for (String after : letters) {
            System.out.println(after);
            }

    }
}
