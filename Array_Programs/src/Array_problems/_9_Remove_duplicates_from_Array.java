package Array_problems;

public class _9_Remove_duplicates_from_Array {
	public static void main(String[] args) {

		int arr[] = {1,1,2,1,0,0,4,5,2,5,6,7};

		int a[]=new int[arr.length];
		int k=0;
		int max=0;
		
		for(int i=0; i<arr.length; i++)
		{
			int count=1;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;			
					
				}
				
			}
			if(count==1)
			{
				max++;
				a[k++]=arr[i];
			}
		}
		
		
		int b[]=new int[max];
		for(int i=0;i<b.length;i++) {
			
			b[i]=a[i];
		}
		
		
		
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}

		
		
		
//		for(int i=0; i<arr.length; i++)
//		{
//			int count=0;
//			for(int j=0; j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++;			
//					
//				}
//				
//			}
//			if(count==1)
//			{
//				a[k++]=arr[i];
//			}
//		}
//		
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
//	}
//}














//	int count =0;
//	
//	for(int i=0;i<arr.length-1; i++)
//	{
//		
//			if(arr[i]!=arr[i+1])
//			{
//				count++;
//				
//			}
//		}
//System.out.println(count);
//	int a[] = new int[count];
//	System.out.println(arr.length-1);
//	
//	
//	int k=0;
//	
//	
//	for(int i=0;i<arr.length-1; i++)
//	{
//		
//			if(arr[i]!=arr[i+1])
//			{
//				a[k++]=arr[i];
//				
//			}
//		}
//	
//	
//	for(int i=0;i<a.length; i++)
//	{
//		if(a[i]!=0)
//		System.out.print(a[i]);
//	}
//	}


