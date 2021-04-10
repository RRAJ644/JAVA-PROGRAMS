import java.util.*;
public class q8 {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int i = 1;
        System.out.println(n);
        while(i!=n)
        {
            for(int j=n; j>=n-i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            i++;
        }
    }
}