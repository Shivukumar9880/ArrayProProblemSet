package Array_problems;

public class _Find_Max_frequencey_of_element 
{
//		        int[] arr = {2, 3, 2, 5, 6, 7, 2, 5, 5, 5,3,3,3,3,3,};


	 public static int[] findMaxFrequencyElement(int[] arr) 
	 {
	        int maxEle= arr[0];
	        int maxFreq = 0;

	        int [] res=new int[2];
	        for (int i = 0; i < arr.length; i++) 
	        {
	            int currEle = arr[i];
	            int currFreq = 1;

	            for (int j = i + 1; j < arr.length; j++) 
	            {
	                if (arr[j] == currEle) 
	                {
	                    currFreq++;
	                }
	            }

	            if (currFreq> maxFreq) 
	            {
	            	maxFreq = currFreq;
	            	maxEle = currEle;
	            }
	        }

	        
	        res[0]=maxEle;
	        res[1]=maxFreq;
	        return res;
	    }

//	    public static int findFrequency(int[] arr, int element) 
//	    {
//	        int frequency = 0;
//
//	        for (int i=0;i<arr.length; i++ )
//	        {
//	            if (arr[i] == element)
//	            {
//	                frequency++;
//	            }
//	        }
//
//	        return frequency;
//	    }
	
	
	    public static void main(String[] args)
	    {
	        int[] arr = {3, 3,2,3,4,5,7,9,9,9,9,99,99,99,99,99,99,99};

	        int[] maxFrequencyElement = findMaxFrequencyElement(arr);
	        
	        for(int i=0;i<maxFrequencyElement.length;i++)
	        {
	        	if(i==0)
	        		System.out.println("highest frequency element in array : "+maxFrequencyElement[i]);
	        	else
	        		System.out.println("frequency of that element  array : "+maxFrequencyElement[i]);

	        }
	        	
//	        int maxFrequency = findFrequency(arr, maxFrequencyElement);

//	        System.out.println("Element with maximum frequency: " + maxFrequencyElement);
//	        System.out.println("Maximum frequency: " + maxFrequency);
	    }

	   
	

}
