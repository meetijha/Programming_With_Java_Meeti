package ex_05_Strings;

public class P043_Convert_First_Letter_To_Uppercase {
    public static void main(String[] args) {
        String str="hi, i am meeti.";

        System.out.println(toUpperCaseFirstLetter(str));

    }
    public static String toUpperCaseFirstLetter(String str){


        StringBuilder sb=new StringBuilder();
        String[] words=str.split(" ");
        for(String word:words)
        {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        sb.trimToSize();
     return sb.toString();
    }
}
