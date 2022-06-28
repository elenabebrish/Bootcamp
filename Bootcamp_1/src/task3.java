import java.util.Scanner;

public class task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a whole number: ");
            int number = scanner.nextInt();
            System.out.println(number % 2 == 0);
        }
    }
