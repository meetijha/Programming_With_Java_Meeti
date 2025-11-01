package ex_01_Patterns;

import java.util.Scanner;
/*
12345
1234
123
12
1
*/
public class P007_InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n-rows+1; col++)
                System.out.print(col);
            System.out.println();
        }
        scanner.close();
    }
}
