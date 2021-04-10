import java.util.*;
public class q16 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int i = 1;
        while(i!=6)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
            i++;
        }

    }
}