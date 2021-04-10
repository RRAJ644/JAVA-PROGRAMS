import java.util.*;
public class pattern10 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i<=n)
        {
            for(int j=n-1; j>=i; j--)
            {
                System.out.print(" ");
            }

            for(int y=1; y<=n; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}