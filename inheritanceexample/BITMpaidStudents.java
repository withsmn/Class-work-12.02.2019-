package inheritanceexample;

public class BITMpaidStudents extends BitmStudents{
	private double courese_fee;
	private String collaborative_company;
	
	
	
	public double getCourese_fee() {
		return courese_fee;
	}
	public void setCourese_fee(double courese_fee) {
		this.courese_fee = courese_fee;
	}
	public String getCollaborative_company() {
		return collaborative_company;
	}
	public void setCollaborative_company(String collaborative_company) {
		this.collaborative_company = collaborative_company;
	}
	
//  Parent class already returning project marks so no need to override	
//	@Override
//	public double getTotalMarks() {
//		// TODO Auto-generated method stub
//		return super.getProject_marks();
//	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"BITMpaidStudents [courese_fee=" + courese_fee + ", collaborative_company=" + collaborative_company
				+ "]";
	}
	
	
	

}
