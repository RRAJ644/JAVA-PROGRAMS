import java.util.*;
public class q5 {
    public static void main(String[]ars){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int j;
        int i=1;
        int z=n;
        while(z!=0)
        {
            for (j = z; j >= i; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            z--;
        }
        int a = 1;
        while(a!=6)
        {
            for (int b=a; b>=1; b--)
            {
                System.out.print(b + " ");
            }
            System.out.println();
            a++;
        }
}
}
