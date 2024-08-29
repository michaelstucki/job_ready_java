package job_ready_java;

import java.util.Scanner;

/**
 *
 * @author michaelstucki
 */
public class Adder {

    static int getOperand(Scanner scanner, String order) {
        int number = 0;
        boolean isValid = false;
        do {
            System.out.print("Enter the " + order + " number to add: ");
            String numberStr = scanner.nextLine();
            try {
                number = Integer.parseInt(numberStr);
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Invalid number!");
            }
        } while(!isValid);
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = getOperand(scanner, "first");
        int number2 = getOperand(scanner, "second");
        int sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
        scanner.close();
    }
}
