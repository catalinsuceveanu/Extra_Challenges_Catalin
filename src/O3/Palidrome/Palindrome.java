package O3.Palidrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a word: ");
        String word = scanner.nextLine();
        boolean flag = false;  //initialize a flag, which remembers if the word is or isn't a Palindrome

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) { //if the pair of chars is the same set flag to true
                flag = true;
            } else {  //if, at any point in the verification the chars are not the same, it set the flag back to false and breaks the loop
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
