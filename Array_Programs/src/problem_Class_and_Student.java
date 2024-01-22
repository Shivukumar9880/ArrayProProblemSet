
public class problem_Class_and_Student {

	public static void main(String[] args) {
		
		String [] names= {"ram","sham","rahul"};
		int m1[]= {100,99,99};
		int m2[]= {100,68,99};
		int m3[]= {100,99,99};
		int avg[]=new int[names.length];
		
		int sum=0;
		for(int i=0;i<names.length;i++)
		{
			avg[i]=(m1[i]+m2[i]+m3[i])/3;
			sum+=avg[i];
		}
		int cavg=sum/names.length;
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println("NAME IS : "+names[i]+" Avarage Marks : "+avg[i]);
		}
		System.out.println("College Avarage is : "+ cavg);
		
		
	}
}
