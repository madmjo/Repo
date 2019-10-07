
package week3Project;

import javax.swing.JFrame;

public class GUIRelay {

	
	  public CustomerRegister register1 = new CustomerRegister () ; 
	  public ArticleRegistry articleregister1 = new ArticleRegistry () ; 
      public JFrame frame ; 
      int orderindex  ;
      boolean orderdone ; 
      int test = 1 ;
     
	  public GUIRelay(JFrame frame) 
	  {this.frame = frame ;}	  
	  
	 
	public GUIRelay() {
		// TODO Auto-generated constructor stub
	}


	public  String GUIFindCust(String id)
	{
		String found = "Customer Not Found" ; 
		if (register1.findCustomer(id) != null )
		{
			found = register1.findCustomer(id).toString() ;
		}
		return found ;
		 
	}

	public void createNewCustomer (String name , String address , String phone , int type , String id)
	{  // 0 private and 1 corporate
	   if (type == 0 )
	   {
		   //bypassing having to name the new customers created from gui 
		   //as there is no dynamic variable names for java
		   
		   register1.addCustomer(new PrivateCustomer(name,address,phone,id));
	
		  
	   }
	   else if (type == 1 )
	   { register1.addCustomer(new CorporateCustomer(name,address,phone,id));}   
	   
	}

	public void createNewCustomertest (String name , String address , String phone , String id)
	{  
		   register1.addCustomer(new PrivateCustomer(name,address,phone,id));
		    
	}

	public void removeCustomer (String id)
	{
		System.out.println("relay remove method");
		register1.deleteCust(id);	
	}
	
	public Customer loginCustomer (String id)  // 
	{
		System.out.println(register1.findCustomer(id)) ;
		return register1.findCustomer(id) ;
	}

	
	public void fillShop ()
	{
		register1.getCustomerList().clear();
		articleregister1.getArticleList().clear();
	 Article article1 = new Article ("D11","Dress",200) ;
	 Article article2 = new Article ("BB23","BarBells",150) ;
	 Article article3 = new Article ("T45","Toy",220) ;
	 Article article4 = new Article ("PH14","Phone",1000) ;
	 Article article5 = new Article ("L589","Laptop",3000) ;
	 Article article6 = new Article ("S086","Shoes",300) ;
	 articleregister1.addArticle(article1);
	 articleregister1.addArticle(article2);
	 articleregister1.addArticle(article3);
	 articleregister1.addArticle(article4);
	 articleregister1.addArticle(article5);
	 articleregister1.addArticle(article6);
	 
	 PrivateCustomer pcustomer1 = new PrivateCustomer ("Dina" , "Malmo", "24177" , "12345") ; 
	 PrivateCustomer pcustomer2 = new PrivateCustomer ("Haitham" , "Malmo", "24678" , "83042956") ; 
	 CorporateCustomer ccustomer1 = new CorporateCustomer ("BG Corp" , "Lund", "2466" , "CORP8765") ; 
	 CorporateCustomer ccustomer2 = new CorporateCustomer ("SC CORP" , "karlskrona", "75433" , "CORP9754") ; 
	register1.addCustomer(pcustomer1);
	register1.addCustomer(pcustomer2);
	register1.addCustomer(ccustomer2);
	register1.addCustomer(ccustomer1);
	Supplier supplier1 = new Supplier  () ;
	Supplier supplier2 = new Supplier () ;
	supplier1.setName("Supplier1");
	supplier2.setName("Supplier2");
	supplier1.addArticletosupplier(article1);
	supplier1.addArticletosupplier(article2);
	supplier1.addArticletosupplier(article3);
	supplier2.addArticletosupplier(article4);
	supplier2.addArticletosupplier(article5);
	supplier2.addArticletosupplier(article6);
   SupplierRegister reg1= new SupplierRegister() ;
   reg1.addsupplier(supplier1);
   reg1.addsupplier(supplier2);	
   article1.setSupplier(supplier1);
   article2.setSupplier(supplier1);
   article3.setSupplier(supplier1);
   article4.setSupplier(supplier2);
   article5.setSupplier(supplier2);
   article6.setSupplier(supplier2);
   
	}
	
	public void guiplaceOrder (String customerid , Article article , int quantity)
	{
	  	
		/*
		orderindex =register1.findCustomer(customerid).getOrderList().indexOf(register1.findCustomer(customerid).addOrder(new Order ())) ;
		System.out.println(orderindex + customerid + register1.findCustomer(customerid).getOrderList().get(orderindex).toString() ) ;
		register1.findCustomer(customerid).getOrderList().get(orderindex).setCustomer(register1.findCustomer(customerid));
		
		*/
		//need another functions to add orderlines with some sort of while loop !
		//while ( orderdone = false)
		register1.findCustomer(customerid).getOrderList().get(orderindex).addOrderLine(new OrderLine(quantity,article,register1.findCustomer(customerid).getOrderList().get(orderindex)));	
	
		System.out.println("adding order line");
		System.out.println("number of orderlines " + register1.findCustomer(customerid).getOrderList().get(orderindex).getOrderLine().size());
	}
	
	public void initializeOrder (String customerid)
	{
		orderindex =register1.findCustomer(customerid).getOrderList().indexOf(register1.findCustomer(customerid).addOrder(new Order ())) ;
		System.out.println(orderindex + customerid + register1.findCustomer(customerid).getOrderList().get(orderindex).toString() ) ;
		register1.findCustomer(customerid).getOrderList().get(orderindex).setCustomer(register1.findCustomer(customerid));
		
	}
	
	public String calculateprice(String customerid)
	{  String sumString = null ;
		double sum = 0  ;
		for (int i = 0 ; i < register1.findCustomer(customerid).getOrderList().size() ; i ++ )
		{
			for (int z = 0 ; z <  register1.findCustomer(customerid).getOrderList().get(i).getOrderLine().size(); z ++ ) {
				sum += register1.findCustomer(customerid).getOrderList().get(i).getOrderLine().get(z).getQuantity() * register1.findCustomer(customerid).getOrderList().get(i).getOrderLine().get(z).getArticle().getPrice() ;   
				
			}
		}
		
		sumString = sum + " kronor" ;
		return sumString ;
	}	
	

	public void testing ()
	{
		System.out.println(test + "heerrrreeeee") ;
	}
	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
      //  register1.addCustomer(pc1);
	//	System.out.println(GUIFindCust("123") + " this" );
	//	System.out.println(register1.getCustomerList().get(0).toString());
		
		
		
		
		
		
	}

}
