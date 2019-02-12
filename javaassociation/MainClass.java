package javaassociation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Sajeeb", 25);
		Address a1 = new Address("200", "8", "Dhaka", "1215");
		s1.setAddress(a1);
		
		s1.setContact(new ContactInfo("Sajeeb@gmail.com", 0123652145));
		
		System.out.println(s1.getAddress().getZipCode());
		
		System.out.println(s1);
	}

}
