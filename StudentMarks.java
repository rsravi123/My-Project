package studentRecords;

import java.util.Scanner;

public class StudentMarks {
	
	public void getStudentDetails(String name, String fname, int roll, String collagename, 
			int mmarks, int smarks, int emarks, int hmarks, int cmarks) {
		
		System.out.println("********Student Marks sheet**********");
		System.out.println("Stuedent name: Mr."  +name);
		System.out.println("Father's name:" +fname);
		System.out.println("Roll no      :" +roll);
		System.out.println("Collage name :" +collagename);
		System.out.println("-------Your Subject's marks-------" );
		System.out.println(" Maths Obtained marks:  " + mmarks);
		System.out.println(" Science Obtained marks:" +smarks);
		System.out.println(" English Obtained marks:" +emarks);
		System.out.println(" Hindi Obtained marks:  " +hmarks);
		System.out.println(" Computer Obtained marks:" +cmarks);
		
		//int allmarks= mmarks+smarks+emarks+hmarks+cmarks;
		MarksCalculator mc= new MarksCalculator();
		int allmarks= mc.getAdd(mmarks, smarks, emarks, hmarks, cmarks);
		System.out.println("Your total obtained marks is     : " +allmarks);
		
		float percentage = mc.getPercent(allmarks) ;
		System.out.println("Your obtained marks percentage is: " +percentage +"%");
		System.out.println("\n******** Have a nice day **********");
	}
	
	

	public static void main(String[] args) {
		StudentMarks sm=new StudentMarks();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------Enter your Student detals:-----");
		System.out.println("Enter Stuedent name:" );
		String name=sc.next();
		System.out.println("Enter Father's name:" );
		String fname=sc.next();
		System.out.println("Roll no      :" );
		int roll=sc.nextInt();
		System.out.println("Collage name :" );
		String collagename=sc.next();
		System.out.println("-------Enter your Subject's marks-------" );
		System.out.println("Enter your Maths marks:" );
		int mmarks=sc.nextInt();
		System.out.println("Enter your Science marks:" );
		int smarks=sc.nextInt();
		System.out.println("Enter your English marks:");
		int emarks=sc.nextInt();
		System.out.println("Enter your Hindi marks:" );
		int hmarks=sc.nextInt();
		System.out.println("Enter your Computer marks:" );
		int cmarks=sc.nextInt();
		
		sm.getStudentDetails(name, fname, roll, collagename, mmarks, smarks, emarks,hmarks, cmarks);
		
	}
}
