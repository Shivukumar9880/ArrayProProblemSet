package Array_problems;

public class _6_How_To_Move_Zeros_To_End_OF_An_Array 
{

	public static int[] findFreq(int arr[])
	{
		int maxEle=arr[0];
		int maxfreq=0;
		for(int i=0;i<arr.length;i++)
		{
			int currEle=arr[i];
			int currFreq=1;

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==currEle)
				{
					currFreq++;
				}
			}
			if(currFreq>maxfreq)
			{
				maxfreq=currFreq;
				maxEle=currEle;
			}

		}
		return new int[] {maxEle,maxfreq};

	}
	
	public static void moveZero(int a[])
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0&& a[j]==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(a[j]!=0)
				j++;
		}
	}
	public static void main(String[] args) {

		int [] a= {10,0,0,30,10};
		int[] moveZero = findFreq(a);

		moveZero(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		


	}
}
