package Array_problems;

public class _4_Find_freq_Of_Array {

	public static void main(String[] args) {
		
		int a [] = {1,2,1,2,3,3,3,5,5,5,5,5,5};
		
		int fre[] = new int[a.length];
		
	    int visited = -1;
	    
	    int max =a[0];
	    

	    for(int i=0; i<a.length;i++)
	    {
	    	int count=1;
	    	
	    	for(int j=i+1; j<a.length;j++)
	    	{
	    		if(a[i]==a[j])
	    		{
	    			count++;
	    			fre[j]=visited;
	    		}
	    		
	    		if(fre[i]!=visited)
	    		{
	    			fre[i]=count;
	    		}
	    	}
	    }
	    
	    for(int i=1;i<fre.length;i++)
	    {
	    	if(max<fre[i])
	    	{
	    		max=fre[i];
	    	}
	    }
	    
	    for(int i=0;i<fre.length;i++)
	    {
	    	
	    	
	    	if(fre[i]!=visited)
	    	{
	    		if(fre[i]==max)
	    		System.out.println(a[i]+"    "+fre[i]);
	    	}
	    	
	    }
	}
}
