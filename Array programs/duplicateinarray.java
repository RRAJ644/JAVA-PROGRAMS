import java.util.*;
public class duplicateinarray {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int x [] = new int [n];
        for(int i=0; i<n; i++) // array
        {
            x[i]=scn.nextInt();
        }
        for(int i=0; i<x.length-1; i++){
            for(int j=i+1;j<x.length;j++)
            {
                if(x[i]==x[j] & i!=j)
                {
                    System.out.println("duplicate elements"+" "+x[j]);
                }
            }
        }
    }
}