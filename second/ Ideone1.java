/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else if(num%2!=0)
		 {
		 	System.out.println("Odd");
		 }
		 else
		 {
		 	System.out.println("invalid");
		 }
	}
}