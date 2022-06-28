import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter boolean b1: ");
        boolean input = scanner.nextBoolean();
        System.out.println("Enter boolean b2: ");
        boolean input2 = scanner.nextBoolean();

        if(input == input2){
            System.out.println("Is " + input + " and " + input2 + " equal? " + true);
        } else{
            System.out.println("Is " + input + " and " + input2 + " equal? " + false);
        }
    }

}
