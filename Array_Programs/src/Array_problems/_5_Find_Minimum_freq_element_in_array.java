package Array_problems;

public class _5_Find_Minimum_freq_element_in_array 
{

	
	public static void main(String[] args) {
		
        int[] arr = {3, 3,2,3,4,5,7,9,9,9,9,99,99,99,99,99,99,99};
        int maxEle= arr[0];
        int maxFreq = 0;
       for (int i = 0; i < arr.length; i++) 
       {
           int currEle = arr[i];
           int currFreq = 1;

           for (int j = i + 1; j < arr.length; j++) 
           {
               if (arr[j] == currEle) {
                   currFreq++;
               }
           }

           if (currFreq < maxFreq) 
           {
           	maxFreq = currFreq;
           	maxEle = currEle;
           }
       }
       
       System.out.println("min freq"+maxFreq+" maxele"+maxEle);
	}

}