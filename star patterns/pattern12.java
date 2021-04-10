import java.util.*;
public class pattern12 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i!=n+1)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            i++;
        }
        i=2;
        while(i!=n+1)
        {
            for(int y=2; y<=i+1; y++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            i++;
        }

    }
}