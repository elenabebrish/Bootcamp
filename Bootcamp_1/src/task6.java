import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input whole number a: ");
        int number1 = scanner.nextInt();
        System.out.print("Input whole number b: ");
        int number2 = scanner.nextInt();

        if (number1 == number2 || (number1 < 0 && number2 > 0) || (number1 > 100 && number2 > 100)) {
            System.out.println("true");
        }else{
            System.out.println("nothing happens");
        }


    }
}

