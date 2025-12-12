package ex_05_Strings;

public class P037_Pallindrome {
    public static void main(String[] args) {

        String str="racecar";
        System.out.println(isPallindrome(str));

    }

    public static boolean isPallindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
