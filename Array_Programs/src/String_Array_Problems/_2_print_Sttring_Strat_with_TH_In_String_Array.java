package String_Array_Problems;

public class _2_print_Sttring_Strat_with_TH_In_String_Array 
{

	public static void main(String[] args) {
		
		String s[]= {"This","Is","That","Job","Tot","Do"};
		
	   	for(int i=0;i<s.length;i++)
		{
			 if(s[i].startsWith("Th"))
			   System.out.println(s[i]);
		}

	}
}
