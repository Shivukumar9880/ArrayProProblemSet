//package String_Array_Problems;
//
//public class String_word_frquence 
//{
//
//	public static void main(String[] args) {
//		
//		String s="This Is Is Is This Not Is Not That Ram";
//		
//		s=s+" ";
//		String word="";
//		int count=0;
//		boolean b[]=new boolean[s.length()];
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			
//			if(ch!=' ')
//				word+=ch;
//			else
//			{
//				if(!(word.length()==0))
//				{
//                    count++;
//					
//					word="";
//				}
//				
//			}
//				
//		}
//		
//		
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			
//			if(ch!=' ')
//				word+=ch;
//			else
//			{
//				if(!(word.length()==0))
//				{
//                    
//					compare(word, s);
//					word="";
//				}
//				
//			}
//				
//		}
//		
//		
//		for(int i=0;i<b.length;i++)
//		{
//			if(b[i]==false )
//			  System.out.println(i);
//		}
//		
//	}
//
//	private static void compare(String str , String s) 
//	{
//		for()
//		
//		boolean [] am=new boolean[count];
//		String word="";
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			
//			if(ch!=' ')
//				word+=ch;
//			else
//			{
//				if(!(word.length()==0))
//				{
//                   char wr[]= word.toCharArray();
//                  char[] sr= str.toCharArray();
//                  boolean b= check(sr,wr);
//                  if(b)
//                  {
//                	  
//                  }
//                  
//					
//					word="";
//				}
//				
//			}
//				
//		}
//	}
//
//	private static boolean check(char[] sr, char[] wr) {
//	
//		for(int i=0;i<wr.length;i++)
//		{
//			if(sr[i]!=wr[i])
//				return false;
//		}
//		return true;
//	}
//}
