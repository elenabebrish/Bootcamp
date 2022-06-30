package TasksDay4.Arrays;

public class IterateThrough {
    public static void main(String[] args) {

        String[] names = new String[4];
        names [0] = "Thomas";
        names [1] = "Lisa";
        names [2] = "Claudia";
        names [3] = "Daniel";

        for(String name: names) {
            System.out.println(name);
        }


    }
}
