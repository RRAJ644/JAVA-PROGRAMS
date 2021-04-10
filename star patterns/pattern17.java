import java.util.*;
public class pattern17{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i!=n+1)
        {
            for(int j=n; j>=i; j--)
            {
                if(i == j || i == 1 || j == n )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            i++;
        }
    }
}