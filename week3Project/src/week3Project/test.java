package week3Project;
import java.util.* ;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GUIRelay relaytest = new GUIRelay () ; 
		
		relaytest.createNewCustomer("dina", "shit", "fuck", 0, "iddd");
		System.out.println(relaytest.register1.getCustomerList().toString()) ;
		
		
		 PrivateCustomer pc1 = new PrivateCustomer("Dina", "malmo", "24177412" , "ssn1223") ;
		 CorporateCustomer cc1 = new CorporateCustomer("Dina-inc" , "lund", "23456" , "corpid1122");
		
		
		CustomerRegister register2 = new CustomerRegister () ; 
		register2.addCustomer(pc1);
		register2.addCustomer(cc1);
		
		
		System.out.println(cc1.getClass().getName());
		
		
		
		for (int i = 0 ; i < register2.getCustomerList().size() ; i ++ ) 
		{System.out.println(register2.getCustomerList().get(i).toString() ); }
		 System.out.println(register2.findCustomer("ssn1223").toString()) ;
		
		 
		System.out.println("here !" + register2.findCustomer("ssn1223").toString());
		
		System.out.println("here !" + register2.findCustomer("ssn1223").toString());
		
		
		
		 //Order order1 = new Order () ; 
		 //System.out.println(order1.getDate()) ;
		//System.out.println(order1.getOrderNumber()) ;
		
		Article article1 = new Article ("D11","Dress",200) ;
		 Article article2 = new Article ("BB23","BarBells",150) ;
		
		 PrivateCustomer pcustomer1 = new PrivateCustomer ("Dina" , "Malmo", "24177" , "89022779") ; 
		 PrivateCustomer pcustomer2 = new PrivateCustomer ("Haitham" , "Malmo", "24678" , "83042956") ; 
	
		relaytest.register1.addCustomer(pcustomer1);
		relaytest.register1.addCustomer(pcustomer2);
		
		relaytest.guiplaceOrder("89022779", article1, 1);
		
	}

}
