import java.util.*;

public class q3
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i!=6)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            i++;
        }
        int x = n-1;
        while (x!=0)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print(y + " ");

            }
            System.out.println();
            x--;
        }
    }
}