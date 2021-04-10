import java.util.*;
public class printstringusingarray {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        char [] arr = scn.next().toCharArray();
        int i=0;
        int len=arr.length;
        while(i<len)
        {
            System.out.println(arr[i]);
            i++;
        }

    }
}