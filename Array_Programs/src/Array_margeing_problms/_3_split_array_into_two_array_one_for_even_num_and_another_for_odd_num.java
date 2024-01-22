package Array_margeing_problms;

public class _3_split_array_into_two_array_one_for_even_num_and_another_for_odd_num {

	public static void main(String[] args) {
		
		int a[]= {10,23,44,57,99,90};
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				ecount++;
			else
				ocount++;
		}
		int even[]=new int[ecount];
		int odd[]=new int[ocount];
		int k=0;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[k]=a[i];
				k++;
			}
				
			else
			{
				odd[j]=a[i];
				j++;
			}

		}
		for(int i=0;i<even.length;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("---------------------------------");
		for(int i=0;i<odd.length;i++)
		{
			System.out.println(odd[i]);
		}
	}
}
