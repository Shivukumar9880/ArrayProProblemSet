package Array_basic;

public class _7_find_element_that_ends_with_7 
{

	public static void main(String[] args) {
		
		int a[]= {10,27,47,89,77,90};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%10==7)
				System.out.println(a[i]);
		}
	}
}
