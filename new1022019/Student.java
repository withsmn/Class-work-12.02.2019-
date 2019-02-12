package new1022019;

public class Student {
	private String student_name;
	private int student_age;
	private String student_group;
	private int student_batch;
	
	
	// Using Constructor
	public Student(String student_name, int student_age, String student_group, int student_batch) {
		super();
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_group = student_group;
		this.student_batch = student_batch;
	}


	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_age=" + student_age + ", student_group="
				+ student_group + ", student_batch=" + student_batch + "]";
	}
	

	



}
