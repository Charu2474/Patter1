import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int num=t.nextInt();
        int val=1;
        if(num!=0&&num<10)
        {
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                for(int j=i-1;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
