package week3Project;
import java.util.ArrayList;
public class SupplierRegister {

	ArrayList<Supplier> supplist = new ArrayList<Supplier> () ;
	public void addsupplier(Supplier supplier)
	{
		supplist.add(supplier) ;
	}
	
	
	public ArrayList<Supplier> getsupplist ()
	{
		return supplist ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
