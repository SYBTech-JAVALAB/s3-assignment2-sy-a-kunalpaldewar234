
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
class Student_info{
	int id;
	String name;
	double marks;
	char grade;
	static int student_count;
	final static String course_name = "Artificial Intelligence. ";

	// Default constructor 
	Student_info(){
		System.out.println("Default constructor is called.");
		id =0;
		name = "unknown";
		marks = 0.0;
		grade = 'f';
		student_count++;
	}
	// Parameterised constructor 
	Student_info(int id,String name,double marks){
		System.out.println("Parameterised constructor is called.");
		this.id = id;
		this.name = name;
		this.marks = marks;
		student_count++;
	}
	void Calculate_grade(double marks){
		if(marks >=90) {
			System.out.println('A');
		}else if(marks >=80 && marks<90) {
			System.out.println('B');
		}else if(marks >= 70 && marks <80) {
			System.out.println('C');
		}else if(marks >= 60 && marks < 70) {
			System.out.println('D');
		}else if(marks >= 50 && marks < 60) {
			System.out.println('P');
		}else {
			System.out.println('F');
		}
	}
	void Display() {
		System.out.println("------------Display Student Information -------------------");
		System.out.println("Student id : "+id);
		System.out.println("Student name : "+name);
		System.out.println("Student marks : "+marks);
		System.out.print("Student Grade : ");
		Calculate_grade(marks);
		System.out.print("Course Outcome : ");
		System.out.println(course_name);
		System.out.println("---------------------------");
	}
	
}
public class Student {
	
   public static void main(String[] argc) {
	   
	   Scanner src = new Scanner(System.in);
	   Student_info s1 = new Student_info();
	   s1.Display();
	   System.out.println("----------------Enter student information---------------------"); 
	   System.out.print("Enter Student id  ");
	   int id = src.nextInt();
	   src.nextLine();
	   System.out.print("Enter Student name ");
	   String name = src.nextLine();
	   System.out.print("Enter Student Marks : ");
	   double marks = src.nextDouble();
	   Student_info s2 = new Student_info(id,name,marks);
	   s2.Display();
	   System.out.println("Total number student : "+Student_info.student_count);
	   System.out.println("------------------------------------------------");
	   src.close();
	   
   }
}
