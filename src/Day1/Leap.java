package Day1;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year: ");
		int y=sc.nextInt();
		if(y%4==0)
		{
			System.out.print("This is Leap Year");
		}
		else
			if(y%400==0)
		{
			System.out.print("This is Leap Year");
		}
			else
				if(y%100!=0)
				{
					System.out.print("This is Leap Year");		
				}
				else
				{
					System.out.print("Not leap Year");
				}
		sc.close();
	}
	

}
