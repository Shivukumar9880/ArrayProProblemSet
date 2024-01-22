package Raghu_sir_qustion_list_with_time;

public class _1_largest_digit {
	public static void main(String[] args) {

		int[] a= {1,2,34,2,1};
		int []b=new int[100];
		for(int i=0;i<a.length;i++)
		{
			b[a[i]]++;
			
		}
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>1)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
