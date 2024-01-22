
package Array_char_Array_Programs;

public class _3_chenge_the_Case_Of_char_In_Array 
{
	public static void main(String[] args) {
		
		String s="Shivukumar";
		
		
		
		
		
		
		char ch[]=s.toCharArray();
		   
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&& ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]= (char)(ch[i]+32);	
				
			}
			   
		
				
		}
		s=new String(ch);
		System.out.println(s);
	}

}
