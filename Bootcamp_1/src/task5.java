import java.util.Scanner;

public class task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter boolean value: ");
            boolean value = scanner.nextBoolean();
            System.out.println("Opposite of " + value + " is " + !value);
        }
    }

