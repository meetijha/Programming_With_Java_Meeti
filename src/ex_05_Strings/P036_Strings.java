package ex_05_Strings;

import java.util.Scanner;

public class P036_Strings {
    public static void main(String[] args) {

        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz@1234");

        //Strings are IMMUTABLE

        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter name :");
        name=sc.nextLine();
        System.out.println(name);

        String fullName="Tony Stark";
        System.out.println(fullName.length());

        //concatenation
        String firstname="Meeti";
        String lastname="Jha";
        String fullName1=firstname +" "+lastname;
        System.out.println(fullName1);

        //char at
        System.out.println(fullName1.charAt(1));
        printLetters(fullName1);

    }

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
