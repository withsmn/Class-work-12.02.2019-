package Homework;

public class student {
	private String student_name;
	private int student_age;
	private String student_group;
	private int student_batch;
	
	
	// Using Constructor
	public student(String student_name, int student_age, String student_group, int student_batch) {
		super();
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_group = student_group;
		this.student_batch = student_batch;
	}


	
	
	public String getStudent_name() {
		return student_name;
	}




	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}




	public int getStudent_age() {
		return student_age;
	}




	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}




	public String getStudent_group() {
		return student_group;
	}




	public void setStudent_group(String student_group) {
		this.student_group = student_group;
	}




	public int getStudent_batch() {
		return student_batch;
	}




	public void setStudent_batch(int student_batch) {
		this.student_batch = student_batch;
	}




	@Override
	public String toString() {
		return "student [student_name=" + student_name + ", student_age=" + student_age + ", student_group="
				+ student_group + ", student_batch=" + student_batch + "]";
	}
	
	
	

}
