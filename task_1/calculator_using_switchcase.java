package task_1;

import java.util.Scanner;

public class calculator_using_switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number :");
		double num1=sc.nextDouble();
		
		System.out.println("enter operator(+,-,/,*)");
		char operator=sc.next().charAt(0);
		
		System.err.println("enter second number :");
		double num2=sc.nextDouble();
		
		
		
		double result;
		switch(operator)
		{
		  case'+':
			  result=num1+num2;
			  System.out.println("result "+num1+" + "+num2+" = "+result);
			  break;
		  case'-':
			  result=num1-num2;
			  System.out.println("result "+num1+" - "+num2+" = "+result);
			  break;
			  
		  case'/':
			  if(num2!=0)
			  {
			  result=num1/num2;
			  System.out.println("result "+num1+" / "+num2+" = "+result);
			  }
			  else
			  {
				  System.out.println("error division by zero not allowed ");
			  }
			  break;
			  
		  case'*':
			  result=num1*num2;
			  System.out.println("result "+num1+" *S "+num2+" = "+result);
			  break;
			  
	    default:
	    	System.out.println("error : Invalid operator");
		}

	}

}
