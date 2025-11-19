package fun_Programs;

import java.util.Scanner;

public class PallindromeChecker {

/*✅ Palindrome Checker:
Create a program that checks whether a given string is a palindrome.
A palindrome is a word or phrase that reads the same backward as forward
(ignoring spaces, punctuation, and capitalization).
Use an if-else statement to determine if the string is a palindrome.*/

    public static boolean IsPallindrome(String str) {

        //Make all character to lowercase
        String strToLower = str.toLowerCase();

        //remove all spaces.
        String strNoSpace = strToLower.replace(" ", "");

        //Above step not required if below step we are using.
        //removes all punctuation including spaces with empty string
        String cleanedText = strNoSpace.replaceAll("\\p{Punct}", "");

        for (int i = 0; i < cleanedText.length() / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(cleanedText.length() - i - 1))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        //Take input from user using Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        if (IsPallindrome(str))
            System.out.println("It is a Pallindrome");
        else System.out.println("It is not a pallindrome");
        scanner.close();
    }
}


