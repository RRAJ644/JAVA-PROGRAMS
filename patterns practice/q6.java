import java.util.*;
public class q6 {
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
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
            i++;
        }
    }
}

