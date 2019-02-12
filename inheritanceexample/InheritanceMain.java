package inheritanceexample;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitmSEIPStudents seip = new BitmSEIPStudents();
		seip.setName("Sajeeb");
		seip.setCourse_name("Android");
		seip.setSeid(4521563);
		seip.setDuration(144);
		seip.setPhone("01236521365");
		seip.setExamMarks(35.0);
		seip.setProject_marks(70.5);
		seip.setStipend(9360.0);
		
		// Paid course 
		BITMpaidStudents paidstudents = new BITMpaidStudents();
		paidstudents.setCourse_name("PHP");
		paidstudents.setCollaborative_company("Leeds");
		paidstudents.setDuration(100);
		paidstudents.setCourese_fee(12056);
		paidstudents.setName("sajib");
		paidstudents.setPhone("12536214");
		paidstudents.setProject_marks(125);
		
		
		System.out.println(seip);
		System.out.println(paidstudents);
		
		System.out.println(seip.getTotalMarks());
		System.out.println(paidstudents.getTotalMarks());
		

	}

}
