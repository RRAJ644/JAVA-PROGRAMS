import java.util.*;
public class q10 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1;
        while(a!=6)
        {
            for (int b=a; b>=1; b--)
            {
                System.out.print(b + " ");
            }
            System.out.println();
            a++;
        }

    }
}