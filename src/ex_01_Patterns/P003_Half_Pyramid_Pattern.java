package ex_01_Patterns;

import java.util.Scanner;
/* Example :
1
12
123
1234
*/
public class P003_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= rows; j++)
                System.out.print(j);
            System.out.println();
        }
        scanner.close();
    }
}
