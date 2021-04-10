import  java.util.*;
public class q12 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int i=1;
        while(i!=n+1)
        {
            int k=i;
            for(int j=1; j<=i; j++)
            {
                System.out.print(k+" ");
                k=k+n;
            }
            System.out.println();
            i++;
        }
    }
}