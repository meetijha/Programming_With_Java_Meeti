package ex_01_Patterns;

public class P011_SolidRhombus {
    public static void main(String[] args) {
        int n=5;
        for(int rows=1;rows<=n;rows++) {
            for(int sp=1;sp<=n-rows;sp++) {
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++)
            {
                if(rows==1 || star==1 ||star==n || rows==n)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
