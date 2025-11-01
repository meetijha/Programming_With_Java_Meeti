package ex_01_Patterns;

import java.util.Scanner;

/* Example :
A
BC
DEF
GHIJ
*/
public class P004_Character_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        char ch='A';
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= rows; j++)
                System.out.print(ch++);
            System.out.println();
        }
        scanner.close();
    }
}
