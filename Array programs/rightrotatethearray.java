import java.util.*;
public class rightrotatethearray {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x[] = new int[n];
        int i;
        int r = scn.nextInt();
        for (i = 0; i < x.length; i++) {
            x[i] = scn.nextInt();
        }
        for(i=0;i<r;i++)
        {
            int j,last;
            last=x[x.length-1];
            for(j=x.length-1;j>0;j--)
            {
                x[j]=x[j-1];
            }
            x[0]=last;
        }
        System.out.println();
        for(i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}