package checking;

import java.util.Scanner;

public class ReverseString 
{
	public void reverse()
	{
		System.out.println("Enter String Number/Alphabets: ");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{   
			rev=rev+str.charAt(i);	
		}	
		System.out.println("Reverse String :" + rev);
	}
	public static void main(String[] args)
	{
		ReverseString rs=new ReverseString();
		rs.reverse();
	}
}
