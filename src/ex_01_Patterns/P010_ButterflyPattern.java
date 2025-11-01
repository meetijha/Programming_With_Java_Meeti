package ex_01_Patterns;

import java.util.Scanner;

public class P010_ButterflyPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();

        //1st half
        for (int rows = 1; rows <= n; rows++)
        {
            for (int star = 1; star <= rows; star++)
            {
                System.out.print("*");
            }
            for (int sp = 1; sp <= 2*(n-rows); sp++)
            {
                System.out.print(" ");
            }
            for(int star2=1;star2<=rows;star2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int rows = n; rows >= 1; rows--)
        {
            for (int star = rows; star >= 1; star--)
            {
                System.out.print("*");
            }
            for (int sp = 2*(n-rows); sp >=1; sp--)
            {
                System.out.print(" ");
            }
            for(int star2=rows;star2>=1;star2--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();
    }
}
