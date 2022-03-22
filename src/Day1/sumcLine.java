package Day1;

import java.util.Scanner;

public class sumcLine {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first Number");
		int num1=sc.nextInt();
		System.out.print("Enter second number");
		int num2=sc.nextInt();
		int num3= num1+ num2;
		System.out.print("addition of two number:"+num3);
		sc.close();

	}

}
