package checking;

import java.util.Scanner;

public class BlankSpace 
{  
	public void blank()
	{
		System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int word = 1;
		
		for(int i=0; i<str.length(); ++i)
		{
			if(str.charAt(i)==' ')
			word ++;
		}
		System.out.println(+ (word-1));
		System.out.println(+ word);
		
	}
	public static void main(String[] args)
	{
		BlankSpace blk=new BlankSpace();
		blk.blank();
	}
}
