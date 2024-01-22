package Array_margeing_problms;

public class _1_Marge_two_array_elemts_into_Alternativly__in_new_array {

	public static void main(String[] args) 
	{
		
		int a[]= {10,20,30};
		int b[]= {100,200,300};
		
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
			c[k++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
}
