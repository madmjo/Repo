package week3Project;

import java.util.ArrayList;

public class Article {

	private double price;
	private String id;
	private String name;
	private ArrayList<OrderLine> presentinOrdeLines = new ArrayList<OrderLine>();
    private Supplier supplier ;
    
	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addOrderLine (OrderLine orderline)
	{
		presentinOrdeLines.add(orderline) ; 
	}
	
	public ArrayList<OrderLine> getOrderLine ()
	{
		return presentinOrdeLines ;
	}

	
	
	public Article (String id , String name , double price)
	{
		this.name = name ;
		this.id = id ; 
		this.price = price ;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
