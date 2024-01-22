package multiple_Array_Of_Same_Size;

public class _1_How_To_find_cube_Root_Of_Array_Elements 
{

	public static void main(String[] args) {
		
		int a[]= {2,9,6,16,25};
		{
			for(int i=0;i<a.length;i++)
			{
				double b=cube(a[i]);
				System.out.println(b);
			}
		}
	}

	private static double cube(int n) {//9
		
		double x=n;
		for(int i=0;i<10;i++)
		{
//			x=0.5*(x+n/x);
			x=(2*(x+n/(x*x)))/3;
		}
		
		return x;
	}
}
