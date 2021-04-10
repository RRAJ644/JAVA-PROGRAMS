import java.util.*;
public class pattern11 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i!=n+1)
        {
            for(int y=1; y<i; y++)
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