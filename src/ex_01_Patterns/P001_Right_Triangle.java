package ex_01_Patterns;

import java.util.Scanner;

public class P001_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int rows = 1; rows <= n; rows++) {
            for (int star = 1; star <= rows; star++)
                System.out.print("*");
            System.out.println();
        }
        scanner.close();

    }
}
