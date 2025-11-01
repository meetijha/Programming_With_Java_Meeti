package ex_01_Patterns;

import java.util.Scanner;
/*
1
2 3
4 5 6
7 8 9 10
*/
public class P008_FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int count=1;
        for (int rows = 1; rows <= n; rows++) {
            for (int star = 1; star <=rows; star++) {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
