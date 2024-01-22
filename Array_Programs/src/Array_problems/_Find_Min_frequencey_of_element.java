package Array_problems;

import java.time.chrono.MinguoChronology;

public class _Find_Min_frequencey_of_element 
{




	public static void main(String[] args) {

		int[] arr = {3, 3,2,3,4,5,7,9,9,9,9,99,99,99,99,99,99,99};

		int[] ar = findMinFrequencyElement(arr);
		System.out.println("minFreqElement "+ar[0]);
		System.out.println("min Freq "+ar[1]);
	}

	private static int[] findMinFrequencyElement(int[] arr) {

		int minEle=arr[0];
		int minFreq=1;

		for(int i=0;i<arr.length;i++)
		{
			int currEle=arr[i];
			int currFreq=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(currEle==arr[j])
				{
					currFreq++;
				}
			}
			if(currFreq<minFreq && minEle==currEle )
			{
				minFreq=currFreq;
				minEle=currEle;
			}
		}

		return new int[] {minEle,minFreq};
	}
}

