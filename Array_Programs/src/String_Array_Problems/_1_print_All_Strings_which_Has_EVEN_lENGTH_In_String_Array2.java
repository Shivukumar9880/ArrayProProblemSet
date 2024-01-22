package String_Array_Problems;

public class _1_print_All_Strings_which_Has_EVEN_lENGTH_In_String_Array2 
{

	public static void main(String[] args) {
		
		String s[]= {"This","Is","Good","Job","Tot","Do"};
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()%2==0)
			   System.out.println(s[i]);
		}
	}
}
