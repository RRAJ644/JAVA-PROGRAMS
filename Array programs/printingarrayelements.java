import java.util.*;
public class printingarrayelements {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int x [] = new int [n];
        int i;
        for(i=0;i<n;i++)
        {
            x[i]=scn.nextInt();
        }
        for(i=0; i<x.length; i++)
        {
            System.out.print(x[i]+" ");
        }

    }
}