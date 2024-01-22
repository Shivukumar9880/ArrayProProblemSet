package Array_basic;

public class _4_print_all_the_even_numbers_follwed_by_odd_numbers_in_the_array {

	public static void main(String[] args) {
		
		int a[]= {10,29,33,50,89};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");//this forloop is print the even numbers in the array
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");//this forloop is print the even numbers in the array
		}
	}
}
