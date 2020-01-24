package checking;

import java.util.Scanner;

public class Even_Number 
{
	public void even()
	{
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		
		for(int i=2; i<=in; i++)
		{
			if(i%2==0)  
			{
				System.out.println("Even Number: " + i);
			}
			else
			{
				System.out.println("Odd Number: " + i);
			}
		}
	}
	public static void main(String[] args)
	{
		Even_Number en=new Even_Number();
		en.even();
	}
}
