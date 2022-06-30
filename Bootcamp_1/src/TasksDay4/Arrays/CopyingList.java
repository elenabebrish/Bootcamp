package TasksDay4.Arrays;
import java.util.*;

public class CopyingList {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");

        List<String> letters2 = new ArrayList<String>();
        letters2.add("E");
        letters2.add("F");
        letters2.add("G");
        letters2.add("H");

        System.out.println(letters);
        System.out.println(letters2);
        Collections.copy(letters, letters2);
        System.out.println("After copying: " + letters + letters2);

        Collections.shuffle(letters2);
        System.out.println(letters2);

        Collections.reverse(letters);
        System.out.println(letters);

        List<String> letters_extract = letters.subList(0, 2);
        System.out.println("List of first two elements: " + letters_extract);
    }

}
