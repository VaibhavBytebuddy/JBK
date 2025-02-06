package org.jbk.vaibhav;

import java.util.Scanner;

public class DivisibleByFourAndSeven {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%4==0 && num%7==0 )
		{
			System.out.println(num+" is divisible by 7 and 4");
		}
		else
		{
			System.out.println(num+" is not divisible by 7 and 4 5");
		}
		
	}

}
