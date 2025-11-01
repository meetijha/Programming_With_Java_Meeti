package ex_01_Patterns;

import java.util.Scanner;

public class P002_Inverted_Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int rows = n; rows >= 1; rows--) {
            for (int star = 1; star <= rows; star++)
                System.out.print("*");
            System.out.println();
        }
        scanner.close();

    }
}
