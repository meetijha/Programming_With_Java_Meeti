package ex_01_Patterns;

public class P012_DiamondPattern {
    public static void main(String[] args) {
        int n=4;

        // top part is mirror image of bottom part

        //1st half

        for(int rows=1;rows<=n;rows++)
        {
            //spaces
            for(int sp=1;sp<=(n-rows);sp++)
                System.out.print(" ");
            //star
            for(int star=1;star<=2*rows-1;star++)
                System.out.print("*");
            //spaces
            for(int sp=1;sp<=(n-rows);sp++)
                System.out.print(" ");

            System.out.println();
        }

        //2nd half- it is just reverse of top part

        for(int rows=n;rows>=1;rows--)
        {
            //spaces
            for(int sp=(n-rows);sp>=1;sp--)
                System.out.print(" ");
            //star
            for(int star=2*rows-1;star>=1;star--)
                System.out.print("*");
            //spaces
            for(int sp=(n-rows);sp>=1;sp--)
                System.out.print(" ");

            System.out.println();
        }
    }
}
