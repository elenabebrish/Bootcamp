package TasksDay2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        boolean x = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value A: ");
        Integer input = scanner.nextInt();
        System.out.println("Enter value B: ");
        Integer input2 = scanner.nextInt();

        if(input == input2) {
            x = true;
            System.out.println("Is " + input + " equal to " + input2 + "? " + x);
        }else{
            System.out.println("Is " + input + " equal to " + input2 + "? " + x);
        }

        if(input < input2) {
            x = true;
            System.out.println("Is " + input + " less than " + input2 + "? " + x);
            }else{
            System.out.println("Is " + input + " less than " + input2 + "? " + x);

        if(input <= input2) {
            x = true;
            System.out.println("Is " + input + " less or equal to " + input2 + "? " + x);
            } else {
            System.out.println("Is " + input + " less or equal to " + input2 + "? " + x);
        }

        if(input > input2){
            x = true;
            System.out.println("Is " + input + " greater than " + input2 + "? " + x);
        } else {
            System.out.println("Is " + input + " greater than " + input2 + "? " + x);
        }

        if(input >= input2) {
            x = true;
            System.out.println("Is " + input + " greater or equal to " + input2 + "? " + x);
        }else{
            System.out.println("Is " + input + " greater or equal to " + input2 + "? " + x);
        }



        }

    }
}
