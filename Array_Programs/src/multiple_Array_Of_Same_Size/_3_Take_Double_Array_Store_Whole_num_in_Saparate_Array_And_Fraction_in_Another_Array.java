package multiple_Array_Of_Same_Size;

public class _3_Take_Double_Array_Store_Whole_num_in_Saparate_Array_And_Fraction_in_Another_Array {

	public static void main(String[] args) {
		
		
		double a[]= {25.5,80,8,34.55,55.8900};
		int whole[]=new int[a.length];
		double frac[]=new double[a.length];
		for(int i=0;i<a.length;i++)
		{
			whole[i]=(int)a[i];
			frac[i]=a[i]-whole[i];
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(whole[i]+"    "+frac[i]);
		}
	}
}
