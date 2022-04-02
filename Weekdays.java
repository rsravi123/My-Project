package studentRecords;

import java.util.Scanner;

public class Weekdays{
	public void getweek(String day) {
		
		if (day.equals("mon")  || day.equals("tue") || day.equals("wed") || day.equals("thu")) {
            System.out.println("Regular workday");
        }

        else if (day.equals("sat") || day.equals("sun")) {
            System.out.println("Weekend");
        }

        else if (day.equals("fri")) {
            System.out.println("Started Weekend"); 
        }    

        else {
            System.out.println("Invald days ");
        }
	}
	
public static void main(String[] args) {
	
	Weekdays wd=new Weekdays();
        
	Scanner sc = new Scanner(System.in);
    
	System.out.println("Enter Days:");
        String input = sc.next(); 
        wd.getweek(input);
        sc.close();
      
    
}
}