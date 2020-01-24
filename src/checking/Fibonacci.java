package checking;

import java.util.Scanner;

public class Fibonacci 
{
	public void fib()
	{
		System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int a=0; 
		int b=1; 
		int c=2;
		for(int i=1; i<=in; i++)
		{   
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static void main(String[] args)
	{
		Fibonacci f=new Fibonacci();
		f.fib();
	}
}
