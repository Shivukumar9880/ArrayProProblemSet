package Array_basic;

import java.util.Scanner;

public class Number_Xyl 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int out=0;
		int in=0;
		
		int temp=n;//1234
			while(n>0)
			{
				if(temp==n || n<10)
				{
					out=out+n%10;
				}
				else
				{
					in=in+n%10;
				}
				
				n=n/10;
			}
			
			if(in==out)
			{
				System.out.println("xylum:"+temp);
			}
			else
			{
				System.out.println("pholem:"+temp);
			}
			
		
		}
	
	
		
	
	
}
