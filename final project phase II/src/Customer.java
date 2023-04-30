import java.util.*;

public class Customer extends MediaRental implements Comparable<Customer> {// the class who show the customer info

	String ID;
	String mobileNumber;
	String name;// the customer name
	String address;// the customer address
	String plan;// the plan ,limited or unlimited

	public Customer() {// no arg constructor

		super();

	}

	public Customer(String name, String address, String plan) {// arg constructor

		super();
		this.name = name;
		this.address = address;
		this.plan = plan;

	}
	

public Customer( String ID, String mobileNumber,String name, String address, String plan) {//arg constructor for phase 2
		super();
		this.ID = ID;
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.address = address;
		this.plan = plan;

	}

//setters and getters

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}


	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public String getPlan() {

		return plan;

	}
	
	public void setPlan(String plan) {

		this.plan = plan;

	}





//***********************************************

	@Override
	public String toString() {// to string method

		return ID + " " + mobileNumber + " " + name + " " + address + " " + plan;

	}


	@Override
	public int compareTo(Customer m) {// overriding the compareTo method

		return (this.name.compareToIgnoreCase(m.getName()));

	}



}
