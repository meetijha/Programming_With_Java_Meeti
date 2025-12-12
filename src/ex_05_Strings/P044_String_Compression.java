package ex_05_Strings;

public class P044_String_Compression {
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));// a3b2c3d2
        String str1="abc";
        System.out.println(compress(str1));// abc
    }

    public static String compressString(String str)
    {
        StringBuilder sb=new StringBuilder();
        char key=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==key)
            {
                count++;
            }
            else
            {
                sb.append(key);
                if(count>1) {
                    sb.append(count);
                }
                key=str.charAt(i);
                count=1;
            }
        }
        sb.append(key);
        if(count>1) {
            sb.append(count);
        }
        return sb.toString();
    }

    //Another approach
    public static String compress(String str)
    {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<str.length();i++)
       {
           Integer count=1;
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
           {
               count++;
               i++;
           }
           sb.append(str.charAt(i));
           if(count>1){
               sb.append(count);
           }
       }
       return sb.toString();
    }
}
