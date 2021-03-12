package O1.Read_numbers_while_sum_is_less_than_20;
import java.util.Scanner;

public class ReadNumbersWhileSumIsLessThan20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //new Scanner called scanner to allow us to read typed inputs
        double sum = 0;                           //a double to store all the values

        while (sum < 20) {    // a loop to repeat instructions while sum is under 20
            System.out.print("Type a number: ");
            sum = sum + scanner.nextDouble();  // sum is adding each value we type in
        }
        System.out.println("The sum of all the typed numbers is: " + sum);
    }
}
