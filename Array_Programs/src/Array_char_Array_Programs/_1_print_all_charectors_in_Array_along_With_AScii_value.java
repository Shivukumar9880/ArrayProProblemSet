package Array_char_Array_Programs;

public class _1_print_all_charectors_in_Array_along_With_AScii_value 
{

	public static void main(String[] args) {
		
		String s="No26 Sound";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" Ascii value is ->"+(int)ch[i]);
		}
	}
}
