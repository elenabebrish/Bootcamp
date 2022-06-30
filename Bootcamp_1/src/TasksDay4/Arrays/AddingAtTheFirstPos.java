package TasksDay4.Arrays;

import java.util.*;

public class AddingAtTheFirstPos {
    public static void main(String[] args) {

        List<String> colours = new ArrayList<String>();
        colours.add("Black");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Purple");

        System.out.println(colours);

        colours.add(0, "Red");
        colours.add(5, "White");

        System.out.println(colours);

        String element = colours.get(3);
        System.out.println("Fourth element is " + element);

        colours.set(2, "Blue");
        System.out.println(colours);

        colours.remove(2);
        System.out.println(colours);

        String key = "White";
        boolean found = false;

        /*for (int i = 0; i < colours.length; i++) {
            if (key == colours[i]) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }*/

        if (colours.contains("Green")){
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

        Collections.sort(colours);
        System.out.println(colours);
    }
}
