package javaassociation;

public class Student {
	
	private String name;
	private int age;
	
	private Address address; // 1 to 1 Association
	
	private ContactInfo contact; // 1 to 1 Association
	
	
	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}





	public ContactInfo getContact() {
		return contact;
	}





	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}





	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
	
}
