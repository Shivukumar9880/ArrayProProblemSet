package Array_basic;

public class _5_print_only_two_diit_numbers_in_the_array 
{
	public static void main(String[] args) 
	{
		int a[]= {1,02,3,50,89};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>9 && a[i]<100)
				  System.out.println(a[i]);
		}
			
	}
}
