package week3Project;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public class Order {
	Random rand = new Random () ; 
	Date date1 = new Date () ; 
	private int orderNumber ; 
	private String date ; 
	private Customer customer ; 
	private ArrayList<OrderLine> orderlines = new ArrayList<OrderLine> () ; 
	

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getDate() {
		return date;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	public Order ()
	{
		orderNumber = rand.nextInt(9999) + 1111 ;
		date = date1.toString();
		
	}
	
	
	public OrderLine addOrderLine (OrderLine orderline)
	{
		orderlines.add(orderline) ;
		return orderline ;
	}
	
	public ArrayList<OrderLine> getOrderLine ()
	{
		return orderlines ; 
	}

	public String toString () 
	{
		return ("OrderNum " + getOrderNumber() + " date " + getDate() ) ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
