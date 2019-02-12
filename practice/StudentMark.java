package practice;

import java.util.ArrayList;
import java.util.Scanner;

import new1022019.Student;

public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scString = new Scanner(System.in);
		Scanner scint = new Scanner(System.in);
		
		int student_grade;
		
		ArrayList<Integer> st_grade = new ArrayList<>();
		
		
		for(int i = 0; i < 3; i++){
			System.out.println("Please enter Student's grade : ");
			student_grade = scint.nextInt();
			
			if(student_grade < 0 || student_grade > 100){
				System.out.println("Wrong User Input . Please Inser again.");
				i--;
				
			}else{
				st_grade.add(student_grade);
			}
		}
		
		
		System.out.println(st_grade.get(0));
		
		for(int i = 0; i < st_grade.size(); i++){
			int number = st_grade.get(i) / 10;
			switch(number){
			case 0: System.out.println("You have got : "+st_grade.get(i) + " >> F ");
			break;
			case 1:System.out.println("You have got : "+st_grade.get(i) + " >> F ");
			break;
			case 2:System.out.println("You have got : "+st_grade.get(i) + " >> D- ");
			break;
			case 3:System.out.println("You have got : "+st_grade.get(i) + " >> D+ ");
			break;
			case 4:System.out.println("You have got : "+st_grade.get(i) + " >> C- ");
			break;
			case 5:System.out.println("You have got : "+st_grade.get(i) + " >> C+ ");
			break;
			case 6:System.out.println("You have got : "+st_grade.get(i) + " >> B- ");
			break;
			case 7:System.out.println("You have got : "+st_grade.get(i) + " >> B+ ");
			break;
			case 8:System.out.println("You have got : "+st_grade.get(i) + " >> A- ");
			break;
			case 9:System.out.println("You have got : "+st_grade.get(i) + " >> A+ ");
			break;
			case 10:System.out.println("You have got : "+st_grade.get(i) + " >> A+ ");
			break;
			
			}
		}
		
		

	}

}
