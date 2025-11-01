package ex_01_Patterns;

import java.util.Scanner;

public class P006_HalfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n; col++) {
                if (col <= n - rows)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
