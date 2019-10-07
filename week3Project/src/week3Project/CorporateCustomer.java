package week3Project;

public class CorporateCustomer extends Customer {
	
	private String corporateID ; 
	
	
	
	public String getCorporateID() {
		return corporateID;
	}


	public void setCorporateID(String corporateID) {
		this.corporateID = corporateID;
	}


	public double CalculatePrice() {
		double price = 0 ;
		 for (int i = 0 ; i < getOrderList().size() ; i ++)
		 {
			 
		 }
		
		return price ;
	}
	


public CorporateCustomer(String name , String address , String phone , String corporateID ) {
	super(name , address, phone);
	setCorporateID(corporateID) ; 
	
}
	

public String toString()
{
	return "Name " + this.getName() + " Address " + this.getAddress() + " phone " + this.getPhone() +  " corpID " + this.getCorporateID();
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
