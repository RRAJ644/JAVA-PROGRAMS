import java.util.*;
public class q9 {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int x = n;
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