package fun_Programs;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter binary number");
        int binary=scanner.nextInt();
        System.out.println("Its Decimal = "+convertBinaryToDecimal(binary));
        scanner.close();
    }

    public static int convertBinaryToDecimal(int binary)
    {
        int decimal=0;
        int pow=0;
        while(binary!=0)
        {
            decimal =decimal + (binary%10) *(int) Math.pow(2,pow);
            binary=binary/10;
            pow++;
        }
        return decimal;
    }
}
