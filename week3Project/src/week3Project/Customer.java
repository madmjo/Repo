package week3Project;
import java.util.ArrayList;
public abstract class Customer {
	private String name ; 
	private String address ; 
	private String phone ; 
	private ArrayList<Order> orderList = new ArrayList<Order> () ; 
	
	
	public abstract double CalculatePrice() ;  //abstract can enable us to make a discount for corporates 
	
	//public abstract void findCustomer(String id) ; // abstract find method 

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Order addOrder (Order order)
	{
		orderList.add(order) ;
		return order ;
	}
	
	public ArrayList<Order> getOrderList ()
	{
		return orderList ;
	}
	
	public Customer (String name , String address , String phone) {
		setName(name) ; 
		setAddress(address) ; 
		setPhone(phone); 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
