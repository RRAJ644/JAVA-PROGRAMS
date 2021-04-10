import java.util.*;
public class q4 {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int x = n;
        while (x!=0)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print(y + " ");
            }
            System.out.println();
            x--;
        }
        int m=1;
        while(m!=n+1)
        {
            for(int z=1; z<=m; z++)
            {
                System.out.print(z + " ");
            }
            System.out.println();
            m++;
        }
    }
}