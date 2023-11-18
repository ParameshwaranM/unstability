package studentdatabase;
import java.util.Scanner;

public class studentdatabaseclass {

	

	public static   void main(String[] args) {
		
		
		
		System.out.println("Enter number of newstudents to enroll: ");
		Scanner in =new Scanner(System.in);
		int numofStudents=in.nextInt();
		student[] students=new student[numofStudents];
		for(int n=0;n<numofStudents;n++)
		{
			students[n]=new student();
			students[n].enroll();
			students[n].payTution();
			
		}
		for(int n=0;n<numofStudents;n++)
		{
			System.out.println(students[n].toString());
		}
		 
	}

}
