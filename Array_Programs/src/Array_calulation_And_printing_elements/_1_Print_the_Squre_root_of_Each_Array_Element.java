package Array_calulation_And_printing_elements;

public class _1_Print_the_Squre_root_of_Each_Array_Element {
	public static void main(String[] args) {

		int a[]= {100,27,47,25,77,90};

		for(int i=0;i<a.length;i++)
		{

			System.out.println(findsqrt(a[i]));
		}
	}

	private static double findsqrt(double n) {

		double x=n;
		if(n==1 || n==0)
		{
			return n; // Square root of 0 or 1 is the number itself
		}
		  // Use the Babylonian method (Heron's method) for square root approximation
		for (int i = 0; i <10; i++) 
		{ // You can adjust the number of iterations for better accuracy
			x = 0.5 * (x + n / x);//
		}

		return x;

	}
}
