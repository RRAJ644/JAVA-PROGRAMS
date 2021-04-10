import java.util.*;
public class smallestelementsinarray {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x[] = new int[n];
        int i,j;
        for (i = 0; i < x.length; i++)
        {
            x[i] = scn.nextInt();
        }
        int min = x[0];
        for (i = 0; i<x.length; i++)
        {
            if (x[i]<min)
            {
                min=x[i];
            }
        }
        System.out.println("smallest elements"+" "+min);
    }
}
