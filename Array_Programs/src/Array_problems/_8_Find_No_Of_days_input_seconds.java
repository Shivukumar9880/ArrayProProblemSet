package Array_problems;

import java.util.Scanner;

public class _8_Find_No_Of_days_input_seconds {

	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of seconds: ");
	        long totalSeconds = scanner.nextLong();

	        long secondsPerMinute = 60;
	        long secondsPerHour = secondsPerMinute * 60;
	        long secondsPerDay = secondsPerHour * 24;

	        long days = totalSeconds / secondsPerDay;
	        long remainingSeconds = totalSeconds % secondsPerDay;
	        long hours = remainingSeconds / secondsPerHour;
	        remainingSeconds =remainingSeconds % secondsPerHour;
	        long minutes = remainingSeconds / secondsPerMinute;
	        remainingSeconds =remainingSeconds%secondsPerMinute;
           
	        System.out.println("Equivalent to:");
	        System.out.println("Days: " + days);
	        System.out.println("Hours: " + hours);
	        System.out.println("Minutes: " + minutes);
	        System.out.println("Seconds: " + remainingSeconds);

	        System.out.println("----------------------------------------");
	     find(totalSeconds);
	        scanner.close();
	    }
	 
	 public static void  find(long totalseconds)
	 {
		 int secondsPerMinute=60;
		 int secondsPerHour=60*secondsPerMinute;
		 int secondsPerDay=24*secondsPerHour;
		 
		 long days=totalseconds/secondsPerDay;
		 long remainingSecond=totalseconds%secondsPerDay;
		 long Hour=remainingSecond/secondsPerHour;
		 remainingSecond=remainingSecond%secondsPerHour;
		 long minute=remainingSecond/secondsPerMinute;
		 remainingSecond=remainingSecond%secondsPerMinute;
		 long second=remainingSecond%secondsPerMinute;
		 
		 System.out.println("days:"+days+" Hour:"+Hour+" Minute:"+minute+" Seconds:"+second);
	 }
}

