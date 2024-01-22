package Array_calulation_And_printing_elements;

public class _3_Find_Cube_Of_Each_Element_In_The_Array 
{

	public static void main(String[] args) {
		
		int a[]= {3,2,7,9,17,90};

		for(int i=0;i<a.length;i++)
		{
		  
			System.out.println(cube(a[i]));
			
		}
	}

	private static int cube(int n) {
		
		int i=3;
		int prod=1;
		while(i>0)
		{
			prod*=n;
			i--;
		}
	
		return prod;
	}
}
