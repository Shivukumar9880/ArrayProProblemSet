package Array_margeing_problms;

public class _2_marge_two_array_diffrent_in_size 
{
	public static void main(String[] args) {

		int a[]= {10,20,30};
		int b[]= {100,200,300,800};

		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++)
		{   if(i<a.length)
			  c[i]=a[i];
		    else
			  c[i]=b[i-a.length];

		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
