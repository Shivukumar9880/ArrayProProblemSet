

public class _2_Print_Only_UperCase_char_In_Array 
{
	

	public static void main(String[] args) {
		
		/**
		 * use this logic to solve related problems like print only lowerCase char in Array
		 *   print only Digits in Array
		 *   print space char in Array
		 */
		String s="ShivuKumar SOLUTIONS";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
				System.out.print(ch[i]);
//			System.out.println("--------------------------------");
			if((int)ch[i]>=65 && (int)ch[i]<=91)
				System.out.print(ch[i]);
		}
	}
}
