package Array_3_Type_problems;

public class _8_Find_Max_Min_ElementsIn_The_Array {

public static void main(String[] args) {
		
		int a[]= {01,20,54,68,64};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Max Element in Array   is : "+max);
		System.out.println("Min Element in Array   is : "+min);
		
	}
	
}
