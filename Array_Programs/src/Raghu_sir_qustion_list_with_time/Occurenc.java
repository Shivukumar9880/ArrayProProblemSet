package Raghu_sir_qustion_list_with_time;

import java.util.Arrays;

public class Occurenc {
	public static void main(String[] args) {

		int a[]= {2,5,3,72,1};
		
		int i=0;int j=a.length-1;
		while(i<=j)
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			
			i++;
			j--;
		}
		
		
//		muttanna 
//		
//		fo
		
		System.out.println(Arrays.toString(a));
		

	}
}
