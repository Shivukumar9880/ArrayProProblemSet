package Array_basic;

public class _6_print_all_positive_numers_in_the_array {

	public static void main(String[] args) {
		
		int a[]= {-10,-02,40,-50,89};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)//printing only positive number
			   System.out.println(a[i]);

		}
	}
}
