package Array_3_Type_problems;

public class _7_Count_no_of_even_numbers_in_an_array {

	
		
		public static void main(String[] args) {
			
			int a[]= {01,20,54,68,64};
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
					count++;
			}
			System.out.println("No Of Even Numbers in  Array   is : "+count);
		
		
	}
}
