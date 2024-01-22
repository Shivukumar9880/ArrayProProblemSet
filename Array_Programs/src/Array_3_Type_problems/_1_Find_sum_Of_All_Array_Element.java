package Array_3_Type_problems;

public class _1_Find_sum_Of_All_Array_Element 
{

	public static void main(String[] args) {
		
		int a[]= {01,20,54,68,64};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum Of All Array  Elements is : "+sum);
	}
	
}
