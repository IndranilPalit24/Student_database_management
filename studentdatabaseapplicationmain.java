package Student_database_management_app;
import java.util.*;

public class studentdatabaseapplicationmain {

	public static void main(String[] args) {	
				//Ask how many new students user wants to enroll
				System.out.print("Enter the number of students to enroll: ");
				Scanner sc = new Scanner(System.in);
				int noOfStudents = sc.nextInt();
				Student_details[] student=new Student_details[noOfStudents];
				
				//create n number of new students to enroll
				for(int n=0; n<noOfStudents; n++) {
					student[n] = new Student_details();
					student[n].enroll();
					student[n].paytuition();
					
				}
				for(int n=0; n<noOfStudents; n++) {
					System.out.println(student[n].show_status());
				}
				

			}
	}
