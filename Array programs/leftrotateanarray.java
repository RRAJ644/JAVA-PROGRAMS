import java.util.*;
public class leftrotateanarray {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] x = new int [n];
        int r = scn.nextInt(); // how many time rotation
        for(int i=0; i<n; i++) //fills the array
        {
            x[i]=scn.nextInt();
        }
        for(int i=0;i<r;i++)
        {
            int j,first;
            first=x[0];
            for(j=0;j<x.length-1;j++)
            {
                x[j]=x[j+1];
            }
            x[j]=first;
        }
        System.out.println();
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}