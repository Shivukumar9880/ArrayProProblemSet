package Raghu_sir_qustion_list_with_time;

public class b {

	

	
	public static void main(String[] args) {
		
		
		
				int input1=123, 
				input2=223 ,
				input3=412 ,
				input4=498;
				
				
				int a[]=new int[10];
				
				do
				{
					a[input1%10]++;
					
					input1=input1/10;
				}while(input1!=0);
				
				do
				{
					a[input2%10]++;
					
					input2=input2/10;
				}while(input2!=0);
				
				
				do
				{
					a[input3%10]++;
					
					input3=input3/10;
				}while(input3!=0);
				
				do
				{
					a[input4%10]++;
					
					input4=input4/10;
				}while(input4!=0);
				
				
				
				for(int i=0;i<10;i++)
				{
					if(a[i]!=0)
					System.out.println(i+" occurs "+a[i]+" times");
				}
				
				System.out.println((int)('w'-97));
	}
}
