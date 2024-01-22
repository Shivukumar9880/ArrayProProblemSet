package Array_basic;

public class _3_print_elements_of_even_index_numbers 
{
	public static void main(String[] args) {
		
		int a[]= {10,02,40,50,89};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)//printing only even index elements in the array
			 System.out.println(a[i]);
		}
			
	}
}
