import java.util.*;
public class pattern6 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = n;
        while(i>=1)
        {
            for (int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            i--;

        }

    }
}