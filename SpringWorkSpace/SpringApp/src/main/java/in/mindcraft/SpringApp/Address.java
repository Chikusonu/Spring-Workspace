package in.mindcraft.SpringApp;

public class Address {
	private String city ,state;


	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	 public void show() {
		 System.out.println(" "+city+" "+state);
	 }

}
