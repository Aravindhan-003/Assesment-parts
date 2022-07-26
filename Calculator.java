package Phase1_Project;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a=sc.nextInt();
		System.out.println("Enter your second number:");
		int b=sc.nextInt();
		System.out.println("add=1 sub=2 mul=3 div=4 modulo=5");
		System.out.println("Enter your operator:");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			res=a+b;
			System.out.println("Addition of two number is:"+res);
			break;
			
		case 2:
			res=a-b;
			System.out.println("Subtraction of two number is:"+res);
			break;
			
		case 3:
			res=a*b;
			System.out.println("Multiplication of two number is:"+res);
			break;
			
		case 4:
			res=a/b;
			System.out.println("Division of two number is:"+res);
			break;
			
		case 5:
			res=a%b;
			System.out.println("Modulo of two number is:"+res);
			break;
			
		default:
			System.out.println("invalid operator");
			
		
		}
		
	}

}
