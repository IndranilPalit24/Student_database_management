package Student_database_management_app;
import java.util.*;

public class Student_details {
	private String first_Name;
	private String last_Name;
	private int grade_year;
	private String Student_Id;
	private String courses=null;
	private int  tuition_balance;
	private static int costsOfCourses = 600;
	private int id=10000;
	
	//Constructor:prompt user to put name and year
		public Student_details() {
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the first name of the student: ");
			this.first_Name = sc.nextLine();
			
			System.out.print("Enter the last name of the student: ");
			this.last_Name=sc.nextLine();
			
			System.out.print("Enter the 5- digit ID of the student: ");
			this.id=sc.nextInt();;
			
			
			
			System.out.print("1-First Year\n2- Second Year\n3- Third Year\n4- Final Year\n Enter the Grade Year of the student: ");
			this.grade_year=sc.nextInt();
			
			setStudent_Id();
			System.out.println(first_Name+" "+last_Name+" "+Student_Id );
			
			sc.close();
			
		}
		
		//Generate an ID
		private void setStudent_Id() {
			//grade level+ID
			id++;
			this.Student_Id = grade_year+"-"+id;
		}
		//Enroll in courses
		public void enroll() {
				//get inside a loop user hits zero
			do {
				Scanner in = new Scanner(System.in);
				in.nextLine();
				System.out.print("Enter courses to enroll(Q to quit): ");
				String course=in.nextLine();
				if(!course.equals("Q")) {
					courses=courses+"\n"+course;
					tuition_balance+=costsOfCourses;
				}else {
					break;
				}
			}while(1!=0);
			System.out.println("ENROLLED IN "+courses);
			System.out.println("TUITION BALANCE "+tuition_balance);
		}
		
		//view balance and pay tuition
		public void viewBalance() {
			System.out.println("Your balance is: R" +tuition_balance);
		}
		public void paytution(int payment) {
			tuition_balance-=payment;
			System.out.println("Thank you for the payment of R: "+payment);
			viewBalance();
		}
		
		//Show status
	
}
