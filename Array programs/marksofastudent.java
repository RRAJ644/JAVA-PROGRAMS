import java.util.*;
public class marksofastudent {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int i=0;
        while(i<n)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}