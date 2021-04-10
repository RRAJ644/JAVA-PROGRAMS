import java.util.*;
public class rerversethearray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            x[i] = scn.nextInt();
        }
        for (int j=x.length-1; j>=0; j--)
        {
            System.out.print(x[j] + " ");
        }
        }
    }
