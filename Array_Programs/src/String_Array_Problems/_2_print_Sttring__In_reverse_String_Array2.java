package String_Array_Problems;

public class _2_print_Sttring__In_reverse_String_Array2 
{

	public static void main(String[] args) {
		
		String s[]= {"This","Is","That","Job","Tot","Do"};
           
		for(int i=0;i<s.length;i++)
		{
			String rev="";
			for(int j=s[i].length()-1;j>=0;j--)
			{
			
				rev=rev+s[i].charAt(j);
			}
			s[i]=rev;
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
