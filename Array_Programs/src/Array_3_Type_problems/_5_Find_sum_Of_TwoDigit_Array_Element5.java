package Array_3_Type_problems;

public class _5_Find_sum_Of_TwoDigit_Array_Element5 
{
	public static void main(String[] args) {

		int a[]= {01,20,4,50,14,100,2003,445};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>9 && a[i]<100)
			    sum+=a[i];
		}
		System.out.println("Sum Of Two_Ditis  Array  Elements is : "+sum);
	}

}
