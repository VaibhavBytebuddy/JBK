package org.jbk.git.Loops.Programs;

import java.util.Scanner;

public class A {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
      do
      { 
    	  System.out.println("1  :--- print 1 to 10 number using Forloop");
    	  System.out.println("2  :--- print 1 to 10 number using While loop");
    	  System.out.println("3  :--- print 1 to 10 number using Do while loop");
    	  System.out.println("4  :--- Exit");
    	  System.out.println("Enter a choice ");
    	  choice=sc.nextInt();
    	  
    	  switch(choice)
    	  {
    	  case 1:
    		  System.out.println("Start >>>>>>>>>>> Using For");
    		  for(int i=1;i<=10;i++)
    		  {
    			  System.out.println(i);
    		  }
    		  System.out.println("Stop >>>>>>>>>>> Using For");
    	      break;
    	  case 2:
    		  System.out.println("Start >>>>>>>>>>> Using While");
    		  int i=1;
    		  while(i<=10)
    		  {
    			  System.out.println(i);
    			  i++;
    		  }
    		  System.out.println("Stop >>>>>>>>>>> Using  While");
    		  break;
    	  case 3:
    		  System.out.println("Start >>>>>>>>>>> Using Do While");
    		    i=1;
    		   do {
    			   System.out.println(i);
    			   i++;
    		   }while(i<=10);
    		   System.out.println("Stop >>>>>>>>>>> Using Do While");
    		   break;
    		   
    		   
    	  case 4:
    		  System.out.println("Exit.................");
    		  System.exit(1);
    		  
    	  }
      }while(choice!=4);
	}

}
