package bookassociation;

public class Course {
	private String courseName;
	private int cradit;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCradit() {
		return cradit;
	}
	public void setCradit(int cradit) {
		this.cradit = cradit;
	}
	public Course(String courseName, int cradit) {
		super();
		this.courseName = courseName;
		this.cradit = cradit;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", cradit=" + cradit + "]";
	}
	
	
	
}
