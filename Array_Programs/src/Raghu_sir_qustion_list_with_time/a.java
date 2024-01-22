package Raghu_sir_qustion_list_with_time;

public class a {


	public static void main(String[] args) {

		String s="Hello this shiva";
		s=s+" ";
		s=s.toLowerCase();
		String nw="";
		String word="";
		int wc=0;
		
		String spc="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch!=' ')
			{
				word+=ch;
			}
			else
			{
				if(word.length()!=0)
				{
					
					wc++;
					if(wc<2)
					{
						nw=nw+word+" ";
					}
					System.out.println(nw);
					
					if(wc==2)
					{
						char wr[]=word.toCharArray();
						
						for(int j=0;j<word.length();j++)
						{
							if(wr[j]>=48 && wr[j]<=57)
							{
								wr[j]=wr[j];
							}else
							{
								wr[j]=(char)(wr[j]-32);
							}
						}
						nw=new String(wr)+" ";
//						spc=word;
						
					}
				
					
					word="";
				}
			}
			
		}
		
		if(wc<2)
		{
			 System.out.println("less");
		}

		
//		System.out.println((int)('0'));
//		System.out.println(spc);
		System.out.println(nw);
	}

}

