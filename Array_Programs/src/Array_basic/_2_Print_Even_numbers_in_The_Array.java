package Array_basic;

public class _2_Print_Even_numbers_in_The_Array {

	public static void main(String[] args) {
		
		int a[]= {10,02,40,50,89};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.print(+a[i]+" ");
		}
			
	}
}
