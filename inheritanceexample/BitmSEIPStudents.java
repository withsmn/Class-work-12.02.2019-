package inheritanceexample;

public class BitmSEIPStudents extends BitmStudents{
	
private int seid;
private double stipend;
private double examMarks;


public int getSeid() {
	return seid;
}
public void setSeid(int seid) {
	this.seid = seid;
}
public double getStipend() {
	return stipend;
}
public void setStipend(double stipend) {
	this.stipend = stipend;
}
public double getExamMarks() {
	return examMarks;
}
public void setExamMarks(double examMarks) {
	this.examMarks = examMarks;
}

// override cumtom method getTotalMarks

@Override
public double getTotalMarks() {
	// TODO Auto-generated method stub
	return super.getProject_marks() + examMarks;
}


@Override
public String toString() {
	return super.toString()+"BitmSEIPStudents [seid=" + seid + ", stipend=" + stipend + ", examMarks=" + examMarks + "]";
}







}
