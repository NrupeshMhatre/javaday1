package day2;

public class FLrev
{
public static void main(String[] args) 
{
	 int r=0;
	 for(int num=12345; num!=0 ; num=num/10 )
	 {
		 int z=num%10;
		 r=r*10+z;
	 }
	 System.out.print("reverse number:"+r);
}
}
