import java.util.*;
public class averagemarksofstudent {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        double [] arr = new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextDouble();
        }
        double sum=0;
        int i=0;
        while(i<n)
        {
            sum=sum+arr[i];
            i++;
        }
        double avg=sum/n;
        System.out.println("average"+" "+"is"+" "+avg);
    }
}