package studentdatabase;
import java.util.Scanner;

public class student {
        private String firstName;
        private String lastName;
        private int gradeYear;
        private int tutionBalance;
        private String courses;
        private String studentID;
        private static int costofCourse=1500;
        private static int id=1000;
        private String course="";
        public student() {
        	Scanner in=new Scanner(System.in);
        	System.out.println("Enter the first name: ");
        	this.firstName= in.nextLine();
        	System.out.println("Enter the last name: ");
        	this.lastName= in.nextLine();
        	System.out.println("Enter the  yearofstudy: ");
        	this.gradeYear= in.nextInt();
        	 setStudentid();
        	System.out.println( "FullName:" +firstName+" "+lastName+" "+studentID);
        	
        }
        private void setStudentid() {
        	id++;	
        	this.studentID=gradeYear+""+id;
        }
        public void enroll()
        {
        	
        	do {
        	System.out.print("Enter an Course(Q to Quit): ");
        	Scanner in=new Scanner(System.in);
        	String c=in.nextLine();
        	if(!c.equals("Q")) {
        		course=course+"\n"+c;
        		tutionBalance=tutionBalance+costofCourse;	
        	}
        	else {
        		break;
        	}
        	}while(1!=0);

        }
			
        	public void viewBalance(){
        		System.out.println("Your Tution balance is: "+tutionBalance);
        	}
        	
        	public void payTution()
        	{
        		viewBalance();
        		System.out.print("Enter your payment: ");	
        		Scanner in=new Scanner(System.in);
        		int d=in.nextInt();
        		tutionBalance=tutionBalance-d;
        		System.out.println("Thank you for your payment: "+d);	
        		viewBalance();
        	}
        	public String toString()
        	{
        		return "FullName:"+ firstName +" "+lastName + 
        				"\nYear of education:"+gradeYear+
        				"\nStudentID:"+studentID+
        				"\nCourses Enrolled: "+course + 
        				"\nBalance: $"+ tutionBalance;
        	}
        
}
