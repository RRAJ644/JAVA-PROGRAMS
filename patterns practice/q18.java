import java.util.*;
public class q18 {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int i=1;
        while(i!=n+1)
        {
            for (int j=i+1; j<=i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            i++;
        }
    }
}