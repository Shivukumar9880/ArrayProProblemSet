package Array_problems;

public class _1_reverrse_Array 
{

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int j=a.length-1;
//		
		int i=0;
		
		
        while(i<=j)
		{
		   int x=a[i];
		   a[i]=a[j];
		   a[j]=x;
	        i++;
		    j--;
		}
	
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}
}
