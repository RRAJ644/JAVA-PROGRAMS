import java.util.*;
public class copyarrayelementsinznotherarray {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] x = new int [n];
        int [] y = new int [x.length];
        for(int i=0; i<x.length; i++)
        {
            x[i]=scn.nextInt();
        }
        for(int i=0; i<x.length; i++ )
        {
            y[i]=x[i];
        }
        for(int i=0; i<x.length; i++ )
        {
            System.out.println(x[i]);
        }
        System.out.println("copied array");
        for(int i=0; i<x.length; i++ )
        {
            System.out.print(y[i]+" ");
        }
        System.out.println();
    }
}