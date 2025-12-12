package ex_05_Strings;


public class P038_ShortestPath {

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

    public static double getShortestPath(String path)
    {
        int x=0, y=0;
        for(int i=0;i<path.length();i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N':
                    y++;
                case 'S':
                    y--;
                case 'E':
                    x++;
                case 'W':
                    x--;
            }
        }
            int x2=x*x;
            int y2=y*y;
        return Math.sqrt(x2+y2);

    }
}
