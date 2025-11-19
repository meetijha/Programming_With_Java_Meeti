package fun_Programs;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter decimal number");
        int decimal=scanner.nextInt();
        System.out.println("Its Binary = "+convertDecimalToBinary(decimal));
        scanner.close();
    }

    public static int convertDecimalToBinary(int decimal)
    {
        int binary=0;
        int pow=0;
        while(decimal>=1)
        {
            binary = binary +(decimal % 2)* (int)Math.pow(10,pow);
            decimal = decimal / 2;
            pow++;
        }
        return binary;
    }
}
