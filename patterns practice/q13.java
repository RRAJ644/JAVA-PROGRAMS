import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        int x = n;
        while (i != n+1)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i + 1; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
            i++;
        }
    }
}
