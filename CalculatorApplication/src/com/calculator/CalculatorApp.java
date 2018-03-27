package com.calculator;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorApp {
	public static void main(String[] args) {

		int opt,flag=1;	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		do{
		System.out.println("Enter the operation to perform : \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Divison \n Press 0 to exit");
		Scanner scan = new Scanner(System.in);
		opt=scan.nextInt();
		switch(opt){
		case 1: 
			ArithmeticOperation add = 
					(ArithmeticOperation) ctx.getBean("addition");
			int result_add = add.execute();
			System.out.println("Sum Result :" + result_add);
			break;
		
		case 2:
			ArithmeticOperation sub = 
			(ArithmeticOperation) ctx.getBean("subtraction");
			int result_sub = sub.execute();
			System.out.println("Sub Result :" + result_sub);
			break;
		
		case 3:
			ArithmeticOperation mul  = 
			(ArithmeticOperation) ctx.getBean("multiplication");
			int result_mul = mul.execute();
			System.out.println("Multiply  Result :" + result_mul); 
			break;
			
		case 4:
			ArithmeticOperation div = 
			(ArithmeticOperation) ctx.getBean("division");
			int result_div = div.execute();
			System.out.println("Divison  Result :" + result_div); 
			break;
		
		case 0: System.out.println("Thank you");
				flag=0;
				break;
		default:
			System.out.println("Wrong option , try again ");
			break;
		}
		}while(flag==1);
		 
		
	}

}
