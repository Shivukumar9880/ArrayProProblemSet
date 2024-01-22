package Array_problems;

public class _My_Logic_to_find_max_frequeancy_element_and_max_freq 
{
	private static int findMaxElement(int[] arr) {
		
		int MaxElement=arr[0];
		int maxFreq=0;
		for(int i=0;i<arr.length;i++)
		{
			int currentElement=arr[i];
			int currentFreq=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==currentElement)
					currentFreq++;
			}
			if(currentFreq>maxFreq)
			{	maxFreq=currentFreq;
			   MaxElement=currentElement;
	
			}
			
		}
		
		return MaxElement;
	}
	
	static int findMaxFreq(int[] arr ,int n)
	{
		int freq=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
				freq++;
				
		}
		return freq;
	}
	
	
	public static void main(String[] args) {
		
        int[] arr = {2, 3, 2, 5, 6, 7, 2, 5, 5, 5,3,3,3,3,3,3,};
        
        int findMaxElement = findMaxElement(arr);
        
        int findMaxFreq = findMaxFreq(arr,findMaxElement);
        System.out.println(findMaxElement);
        System.out.println(findMaxFreq);
        
        
      final  Object obj=new Object();
        Object ob=obj;
        System.out.println(obj);
        System.out.println(ob);        
	}

	
}
