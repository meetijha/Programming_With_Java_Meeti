package ex_01_Patterns;

import java.util.Scanner;
/*
0
1 0
1 0 1
0 1 0 1
*/
public class P009_01Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int count=0;
        for (int rows = 1; rows <= n; rows++) {
            for (int star = 1; star <=rows; star++) {
                System.out.print(count++ +" ");
                if(count==2) count=0;
            }
            System.out.println();
        }
        scanner.close();
    }
}
