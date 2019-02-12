package inheritanceexample;

public class BitmStudents {
	private String name;
	private String phone;
	private String course_name;
	private int duration;
	private double project_marks;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double getProject_marks() {
		return project_marks;
	}
	public void setProject_marks(double project_marks) {
		this.project_marks = project_marks;
	}
	
	// ===========================================
	public double getTotalMarks(){
		return project_marks;
	}
	
	
	
	
	@Override
	public String toString() {
		return "BitmStudents [name=" + name + ", phone=" + phone + ", course_name=" + course_name + ", duration="
				+ duration + ", project_marks=" + project_marks + "]";
	}
	
	
	
	
	
	

}
