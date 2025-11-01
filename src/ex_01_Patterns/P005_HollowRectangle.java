package ex_01_Patterns;

import java.util.Scanner;

public class P005_HollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b=sc.nextInt();

        for(int i=1;i<=b;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(i==1 || i==b || j==1 || j==l)
                System.out.print("* ");//  enter space here as newline will print with gap

                else{
                    System.out.print("  ");
                    }
                }
            System.out.println();
            }

        }

    }

