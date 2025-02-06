package org.jbk.vaibhav;

import java.util.*;
public class HighestFromThreeNumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is highest");
			}
			else
			{
				System.out.println(c+" is highest");
			}
		}else
		{
			if(b>c)
			{
				System.out.println(b+" is hightes");
			}
			else
			{
				System.out.println(c+" is hightes");
			}
		}
		
	}

}
