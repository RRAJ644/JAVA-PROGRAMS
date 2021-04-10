import java.util.*;
public class sumofarrayelements {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x[] = new int[n];
        int i;
        for (i = 0; i < x.length; i++)
        {
            x[i] = scn.nextInt();
        }
        int sum=0;
        for(i=0;i<x.length;i++)
        {
            sum+=x[i];
        }
        System.out.print("sum of array elements"+" "+sum);
    }
}