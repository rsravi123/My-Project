package studentRecords;

import java.util.Scanner;

public class Calchoice {
	int a,b,out, input;
	Scanner sc= new Scanner(System.in);
	
	public void Add() {
		System.out.println("Enter Adding two no:\n");
		a = sc.nextInt();
		b=sc.nextInt();
		out=a+b;
		System.out.println(out);
		
	}
	
	
	public void Sub() {
		System.out.println("Enter substracting two no:\n");
		a = sc.nextInt();
		b=sc.nextInt();
		out=a-b;
		System.out.println(out); 
		
	}
	public void Multi() {
		System.out.println("Enter multiplication two no:\n");
		a = sc.nextInt();
		b=sc.nextInt();
		out=a*b;
		System.out.println(out);
		
	}
	public void Div() {
		System.out.println("Enter division two no:\n");
		a = sc.nextInt();
		b=sc.nextInt();
		out=a/b;
		System.out.println(out);
		
	}
	
	public static void main(String[] args) {
		Calchoice cd= new Calchoice();
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter your choice 1-add, 2-Sub, 3-Mul, 4-Div");
		
		int input=sc.nextInt();
		
		if(input==1){
		  System.out.println("You have choosen Addition:");
			
		  cd.Add();
		}
		else if(input==2) {
		System.out.println("You have choosen Substraction:");
		cd.Sub();
		}
		else if(input==3) {
			System.out.println("You have choosen Multiplication:");
		
			cd.Multi();
		}
		else if(input==4) {
			System.out.println("You have choosen Division:");
		cd.Div();
		}
		else
		{
			
				System.out.println("Wrong choice:");
		}
		sc.close();
	}

	}


