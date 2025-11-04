A number is called a perfect number if the sum of it’s factors (excluding itself) including 1) is equal to the same number
=======================================================================================================================================================================================================================
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
               s+=i; 
            }
        }
        if(n==s)
        {
            System.out.print("1");
        }
        else {
            System.out.print("0"); 
        }
    }
}
