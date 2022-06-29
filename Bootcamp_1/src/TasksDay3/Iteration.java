package TasksDay3;

import java.util.Arrays;

public class Iteration {
    public static void main(String[] args) {

        long[] numbers = {100336063L, 802386203L, 923905345L, 619238596L};
        long[] newNumbers  = new long[4];

        System.out.println("Source Array : "+ Arrays.toString(numbers));

        for(int i=0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        System.out.println("New Array: "+Arrays.toString(newNumbers));

    }
}
