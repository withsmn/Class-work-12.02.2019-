package javaassociation;

public class ContactInfo {
	private String email;
	private int phone;
	
	
	public ContactInfo(String email, int phone) {
		super();
		this.email = email;
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "ContactInfo [email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
