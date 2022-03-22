package day2;

public class ReverseNum {

	public static void main(String[] args) 
	{
		int num=654321;
		int r=0;
		while(num!=0) 
		{
         int z=num%10;
         r=r*10+z;
         num=num/10;
	}
    System.out.print("Reverse number is:"+r);
	}
}
