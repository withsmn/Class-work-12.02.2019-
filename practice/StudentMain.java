package practice;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("Sajeeb", 22, "Batch 03");
		Student s2 = new Student("Raj", 11, "Batch 03");
		Student s3 = new Student("Solayman", 19, "Batch 03");
		Student s4 = new Student("Daud", 32, "Batch 03");
		Student s5 = new Student("Paul", 18, "Batch 03");
		
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		
		for(Student s: students){
			System.out.println(s);
		}
		
		
	}
	
	

}
