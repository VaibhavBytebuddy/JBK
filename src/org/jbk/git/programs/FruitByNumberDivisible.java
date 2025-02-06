package org.jbk.git.programs;

import java.util.*;

public class FruitByNumberDivisible {

	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num=sc.nextInt();
		 
		 if(num%3==0)
		 {
			 System.out.println("Mango");
		 }else if(num%5==0)
		 {
			 System.out.println("Apple");
		 }else if(num%3==0 && num%5==0)
		 {
			 System.out.println("Apple and Mango");
		 }else
		 {
			 System.out.println(num+ " not satisy above all condition ");
		 }
		 
		 
	}
}
