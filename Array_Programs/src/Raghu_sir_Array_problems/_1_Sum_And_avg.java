package Raghu_sir_Array_problems;

public class _1_Sum_And_avg {

	public static void main(String[] args) {
		
		int[] arr= {2,579,0,8,6,4};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);
		System.out.println(sum/arr.length);
	}
}
