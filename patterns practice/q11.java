import java.util.*;
public class q11 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=1;
        int i=1;
        while(i!=6)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
        System.out.println();
        i++;
        }
}
}