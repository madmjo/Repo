package week3Project;

public class PrivateCustomer extends Customer {
	
	private String ssn ; 
	
	public double CalculatePrice() {
		return 0;}
	

public String getSsn() {
	return ssn;
}

public void setSsn(String ssn) {
	this.ssn = ssn;
}
	

public PrivateCustomer(String name , String address , String phone , String ssn ) {
	super(name , address, phone);
	setSsn(ssn);
	
}

public String toString()
{
	return "Name " + this.getName() + " Address " + this.getAddress() + " phone " + this.getPhone() +  " ssn " + this.getSsn();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
