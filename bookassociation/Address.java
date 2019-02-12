package bookassociation;

public class Address {
	
	private String house;
	private int road;
	private int postcode;
	private String street;
	
	
	
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public int getRoad() {
		return road;
	}
	public void setRoad(int road) {
		this.road = road;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Address(String house, int road, int postcode, String street) {
		super();
		this.house = house;
		this.road = road;
		this.postcode = postcode;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [house=" + house + ", road=" + road + ", postcode=" + postcode + ", street=" + street + "]";
	}
	
	
	

}
