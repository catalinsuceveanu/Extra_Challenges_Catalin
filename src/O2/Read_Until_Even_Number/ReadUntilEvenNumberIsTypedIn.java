package O2.Read_Until_Even_Number;
import java.util.Scanner;

public class ReadUntilEvenNumberIsTypedIn {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        do {
            System.out.print("Type a number: ");
            number = scanner.nextDouble();
        }while (number%2 !=0);

        System.out.print (number + " is an even number.");
    }
}
