package multiple_Array_Of_Same_Size;

public class _2_take_one_Arrya_find_its_sqrt_and_cube_root_Store_it_in_new_saparate_array {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,9,25,49};
		double sqrt[]=new double[a.length];
		double cuberoot[]=new double[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			  sqrt[i]= findsqrt(a[i]);
			  cuberoot[i]=findcuberoot(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("sqrt of number :"+sqrt[i]);
			System.out.println("cube root of number"+cuberoot[i]);
		
		}
	}

	private static double findcuberoot(int n) {
		double x=n;
		
		for(int i=0;i<=10;i++)
		{
			 x=(2 * x + n / (x * x )) / 3;
		}
		    
		
		return x;
	}

	private static double findsqrt(int n) {
		
		if(n==0 || n==1)
		{
			return n;
		}
		double x=n;
		
		for(int i=0;i<=10;i++)
		{
			x=0.5*(x+n/x);
		}

		return x;
	}
}
