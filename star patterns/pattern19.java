import java.util.*;
public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        while(i!=n+1)
        {
            for(int k=n; k>i; k--)
            {
                System.out.print(" ");
            }
            for(int m=1; m<=(i*2)-1; m++)
            {
                if( m == 1 || m == (i * 2) -1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            i++;
        }
    }
}