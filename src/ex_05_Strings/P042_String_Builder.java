package ex_05_Strings;

public class P042_String_Builder {
    public static void main(String[] args) {
        // String references are stored in stack
        // String values are stores in Heap- String pool
        // Everytime a change is made in string a new string is created
        //SO it is very inefficient
        // so we use string builder because it does not create new String. It appends the same one.

        StringBuilder sb=new StringBuilder("MJ");
        for(char i='a';i<='z';i++)
        {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
