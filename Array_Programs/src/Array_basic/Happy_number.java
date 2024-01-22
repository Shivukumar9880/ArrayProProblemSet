package Array_basic;

public class Happy_number {
	
	
	static boolean happy(int n) {
	    int maxIterations = 100; // You can adjust this value as needed
	    int i=1;
	    while (n > 1 &&  maxIterations>0) 
	    {
	        int sum = 0;
	        while (n > 0)
	        {
	            int d = n % 10;
	            d = d * d;
	            sum += d;
	            n = n / 10;
	        }
	        n = sum;
	      System.out.println( n+" "+ maxIterations--);
	    }
	    
	    return n == 1 || n == 7;
	}


	public static void main(String[] args) {

		
		int n=68;
	 	boolean b=happy(n );
	 	if(b)
	 	System.out.println("happy");
	 	else
	 		System.out.println("not happy ");
	
	}


}
