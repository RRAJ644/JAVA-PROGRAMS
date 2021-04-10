import java.util.*;
public class q15 {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int i=1;
        while(i!=n+1)
        {
            for (int j = n; j>i; j--)
            {
                System.out.print(" ");
            }
            int x=1;
            for(int y=1; y<=i; y++)
            {
                System.out.print(x+" ");
                x=x*(i-y)/(y);
            }
            System.out.println();
            i++;
        }

    }
}