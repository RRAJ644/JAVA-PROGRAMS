import java.util.*;
public class pattern8 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        while (i != n + 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            i++;
        }
        i=1;
        while(i!=n){
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            i++;
        }
    }
}