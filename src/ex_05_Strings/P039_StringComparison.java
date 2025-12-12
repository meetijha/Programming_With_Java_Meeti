package ex_05_Strings;

public class P039_StringComparison {

    public static void main(String[] args) {


        String s1 = "Tony";
        String s2 = "Tony";// s2 point to same Tony of s1
        String s3 = new String("Tony");

        if (s1 == s2)
            System.out.println("Strings are equal");// Equal
        else
            System.out.println("Strings are not equal");


        if(s1==s3)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");//Not equal


        if(s1.equals(s3))//only value checked here
        {
            System.out.println("Strings are equal");// equal
        }
        else System.out.println("They are not equal");
    }
}
