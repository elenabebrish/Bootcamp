package TasksDay4.Arrays;

import java.util.*;
public class ComparingLists {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<String>();
        letters.add("K");
        letters.add("B");
        letters.add("O");
        letters.add("N");

        List<String> letters2 = new ArrayList<String>();
        letters2.add("D");
        letters2.add("I");
        letters2.add("O");
        letters2.add("X");

        ArrayList<String> compare = new ArrayList<String>();
        for (String e : letters)
            compare.add(letters2.contains(e) ? "Yes" : "No");
        System.out.println(compare);
    }
}
