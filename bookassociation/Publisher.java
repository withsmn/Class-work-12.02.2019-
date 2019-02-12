package bookassociation;

public class Publisher {
	private String name;
	private int phone;
	
	
	private Address address; // 1 to 1 Association
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	// Constructor
	public Publisher(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
		
	}
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	

}
