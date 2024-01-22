package Array_3_Type_problems;

public class _6_Find_product_Of_Even_Element_in_Array 
{


	public static void main(String[] args) {

		int a[]= {01,20,54,68,64};
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
//			if(a[i]%2==0)
			   prod*=a[i];
		}
		System.out.println("Sum Of Even Array  Elements is : "+prod);
	}


}
