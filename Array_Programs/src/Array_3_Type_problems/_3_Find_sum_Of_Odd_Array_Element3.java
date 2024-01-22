package Array_3_Type_problems;

public class _3_Find_sum_Of_Odd_Array_Element3 
{

	public static void main(String[] args) {

		int a[]= {01,20,54,68,64};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			    sum+=a[i];
		}
		System.out.println("Sum Of Odd Array  Elements is : "+sum);
	}

}
