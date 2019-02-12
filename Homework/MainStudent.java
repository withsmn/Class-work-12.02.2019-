package Homework;

import java.util.ArrayList;

import practice.Student;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st1 = new student("Solayman", 22, "Android", 03);
		student st2 = new student("Sajeeb", 21, "Java", 04);
		student st3 = new student("Daud", 25, "Java", 04);
		student st4 = new student("paul", 26, "PHP", 05);
		student st5 = new student("Eshan", 22, "Android", 03);
		student st6 = new student("Mamun", 20, "Java", 04);
		student st7 = new student("Shuvo", 23, "PHP", 05);
		student st8 = new student("Mahfuz", 23, "PHP", 05);
		student st9 = new student("Shanto", 20, "Android", 03);
		student st10 = new student("Selim", 27, "Java", 04);
	
	
	ArrayList<student> students = new ArrayList<>();
	students.add(st1);
	students.add(st2);
	students.add(st3);
	students.add(st4);
	students.add(st5);
	students.add(st6);
	students.add(st7);
	students.add(st8);
	students.add(st9);
	students.add(st10);
	
	// Show the name of student whose batch is "Android"
	System.out.println("Android Batch Student name");
	for(student s : students){		
		if(s.getStudent_group() == "Android"){
		System.out.println(s.getStudent_name());
		}
		
	}
	
	// Show the name of student whose batch is "Android"
	System.out.println("Batch 03 Student name");
	for(student s : students){
		// Show the name of student whose batch is "Android"
				if(s.getStudent_batch() == 04){
				System.out.println(s.getStudent_name());
	}
	}
	
	
	
	
	}
}
