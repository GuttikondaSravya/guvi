/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp,sum=0;
		temp=n;
		while(n>0)
		   {
		   	   int r=n%10;
		   	   sum=sum+r;
		   	   n=n/10;
		   }
              	System.out.print(sum);
		 
	}
}
