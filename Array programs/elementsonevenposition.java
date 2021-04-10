import java.util.*;
public class elementsonevenposition {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int x [] = new int [n];
        int i;
        for(i=0;i<n;i++)
        {
            x[i]=scn.nextInt();
        }
        for(i=0; i<x.length; i++)
        {
            System.out.println(x[i]+" ");
        }
        for(i=0; i<x.length; i++)
        {
            if(i%2==0)
            {
                System.out.println(x[i]);
            }
        }

    }
}