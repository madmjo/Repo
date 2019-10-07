package week3Project;
import java.util.ArrayList;
public class CustomerRegister {
	
	
	private ArrayList<Customer> customerList = new ArrayList<Customer> () ; 

	public void addCustomer (Customer customer)
	{customerList.add(customer) ; }
	
	public ArrayList<Customer> getCustomerList()
	{return customerList ; }
	
	
	public Customer findCustomer(String id ) ////important method !
	{
		CorporateCustomer cc;
		PrivateCustomer pc ; 
		Customer tmpCust = null; 
	   for (int i =0 ; i < customerList.size() ; i ++)
	   {
		   if (customerList.get(i).getClass().getName().equals("week3Project.CorporateCustomer"))
		   {  
			   cc = (CorporateCustomer) customerList.get(i);  //casting ... very important 
			   if (cc.getCorporateID().equals(id))
			   { tmpCust=cc ; 
			   System.out.println("corporate found");
			   }
		   }
		    
		   else if (customerList.get(i).getClass().getName().equals("week3Project.PrivateCustomer")) 
		   {
			     pc = (PrivateCustomer)customerList.get(i) ; 
			     if (pc.getSsn().equals(id))
			     {tmpCust = pc ;
			     System.out.println("private found");
			     }
		   }  
      }
	   
		return tmpCust ; 
		   
	   }
	
	
	public String getOrderdetails (String custid)
	{
		String odetails ="";
		
		for (int i = 0 ; i < findCustomer(custid).getOrderList().size(); i++)
		{ 
			odetails += "Order Number " + findCustomer(custid).getOrderList().get(i).getOrderNumber() ;
			odetails += "\n" ;
			odetails += "Order Date " + findCustomer(custid).getOrderList().get(i).getDate() ;
			odetails += "\n" ;
			odetails += "Order details" ;
			odetails += "\n" ;
			for (int z=0 ; z<findCustomer(custid).getOrderList().get(i).getOrderLine().size() ; z++)
			{
	
				odetails += findCustomer(custid).getOrderList().get(i).getOrderLine().get(z).getQuantity();
				odetails += " " ;
				odetails += findCustomer(custid).getOrderList().get(i).getOrderLine().get(z).getArticle().getName() ;
				odetails += "\n" ;
				
					
				System.out.println("viewing order details"  + findCustomer(custid).getOrderList().get(i).getOrderLine().get(z).getQuantity() + findCustomer(custid).getOrderList().get(i).getOrderLine().get(z).getArticle().getName() + findCustomer(custid).getOrderList().get(i).getOrderLine().get(z).getArticle().getName());
			   System.out.println("Order number and date" + findCustomer(custid).getOrderList().get(i).getOrderNumber()  +findCustomer(custid).getOrderList().get(i).getDate()  );
			
			}
		}
		return odetails ; 
		}
		
		
	
	public void deleteArticle(String customerid ,String articleID)
	{
		for (int i = 0 ; i < findCustomer(customerid).getOrderList().size() ; i ++ )
			for (int z = 0 ; z <findCustomer(customerid).getOrderList().get(i).getOrderLine().size(); z++ )
		if (findCustomer(customerid).getOrderList().get(i).getOrderLine().get(z).getArticle().getId().contentEquals(articleID))
		{
			findCustomer(customerid).getOrderList().get(i).getOrderLine().remove(z) ;
		}
	}
	
		
	
	public void deleteCust (String id )	
	{
		Customer tmpCust = findCustomer(id); 
		customerList.remove(tmpCust);
		System.out.println("register remove method");
	}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
