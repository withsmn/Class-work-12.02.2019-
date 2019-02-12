package new1022019;

import java.util.ArrayList;
import java.util.Scanner;

public class OopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<>();
		
		Scanner scString = new Scanner(System.in);
		Scanner scint = new Scanner(System.in);
		
		System.out.println("How many student do you want to enroll ? ");
		int student_number = scint.nextInt();
		
		
		
		for(int x = 1; x <= student_number; x++){
			System.out.println("Please Enter Student Name : ");
			String student_name = scString.nextLine();
			
			System.out.println("Please Enter Student Age : ");
			int student_age = scint.nextInt();
			
			System.out.println("Please Enter Student Group : ");
			String student_group = scString.nextLine();
			
			System.out.println("Please Enter Student Batch : ");
			int student_batch = scint.nextInt();
			
			Student st = new Student(student_name, student_age, student_group, student_batch);
			students.add(st);
		}
		
		for(Student s: students){
			System.out.println(s);
		}
		
		
		
		

	}

}
