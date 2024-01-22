package Array_3_Type_problems;

public class _4_Find_sum_Of_positive_Array_Element4 {

	public static void main(String[] args) {

		int a[]= {-01,20,-54,-68,-64};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			   sum+=a[i];
		}
		System.out.println("Sum Of Positive Array  Elements is : "+sum);
	}

}
