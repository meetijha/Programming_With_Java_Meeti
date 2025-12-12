package ex_05_Strings;

public record P041_Lexicographic_Largest_String() {
    public static void main(String[] args) {

        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];

        for(int i=1;i<largest.length();i++)
        {
            if(largest.compareTo(fruits[i])<0);
            largest=fruits[i];
        }
    }
}
// string1.compareTo(string2)==0 if equal
// string1.compareTo(string2)<0 if string1 is smaller
// string1.compareTo(string2)>0 if string1 is bigger