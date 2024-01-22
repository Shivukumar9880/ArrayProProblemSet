package Array_3_Type_problems;

public class _2_Find_sum_Of_Even_Array_Element2 {

public static void main(String[] args) {
		
		int a[]= {01,2,53,753,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			      sum+=a[i];
		}
		System.out.println("Sum Of Even Array  Elements is : "+sum);
	}
	
}
