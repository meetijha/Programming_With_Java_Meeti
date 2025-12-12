package ex_05_Strings;

import java.util.Arrays;

public class P045_Anagrams {
    public static void main(String[] args) {
        String str1="care";
        String str2="race";

        if(checkAnagrams(str1,str2))
        {
            System.out.println("They are anagrams.");
        }
        else{
            System.out.println("They are not anagrams.");
        }

    }
    public static boolean checkAnagrams(String str1,String str2)
    {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) return false;

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);
    }
}
