package checking;

import java.util.Scanner;

public class PrimeNumber 
{
	public void prime()
	{
		System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		boolean flag=true;
		
		for(int i=2; i<=in/2; i++)
		{   
			if(in%i==0)
			{	
				flag=true;
				break;				
			}
		}
			if (!flag)
			{
				System.out.println(in + "prime" );
			}
			else
			{
				System.out.println(in + "Not prime");
			}
		
	}
	
	public static void main(String[] args)
	{
		PrimeNumber pri=new PrimeNumber();
		pri.prime();
	}
}
