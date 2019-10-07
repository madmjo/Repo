import java.util.* ;
import java.sql.* ;



public class dbtestClass {
	
	
	public static String toString1(String[] myarray)
	{
		String string1 ="" ;
		for (int i = 0 ; i < myarray.length ; i ++ )
		{
	        string1 += myarray[i] ;
	        string1 += "    " ;
		}
		return string1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String sql1 = "insert into public.\"Recepies\" (duration,beginner_level,recipe_name,ingredients) VALUES (100,true,'wat','up,up,up');" ;
	String sql2 = "Select * from public.\"Recepies\";";
	ArrayList<String[]> result = new ArrayList<String[]> () ;
	 //ResultSet resultset  = null ;
	
	try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "database") ) 
	
			{
				System.out.println("Connected!") ; 
				System.out.println(DriverManager.getLoginTimeout());
				Statement statement1 = connection.createStatement();
				//statement1.executeUpdate(sql1) ; //donot want to fil db with garbage 
				ResultSet resultset = statement1.executeQuery(sql2) ;
				while (resultset.next()) {
				String ing = resultset.getString("ingredients");
				//System.out.println(ing);
				String[] resultrow = new String[4]  ;
				resultrow[0] = String.valueOf(resultset.getInt("duration"));
				resultrow[1]=Boolean.toString(resultset.getBoolean("beginner_level")) ;
				resultrow[2]=resultset.getString("recipe_name") ;
				resultrow[3]=resultset.getString("ingredients");
					result.add(resultrow) ;
					//System.out.println(toString1(resultrow));
				
				
				}
			}
		
			catch (Exception e)
			{
				System.out.println("Connection failed");
			}
			
	for (int i = 0 ; i < result.size(); i ++)
	
	System.out.println(toString1(result.get(i)));
	
	
	
	String trys  = "this,is,sparta" ;
	String[] wat =trys.split(",");
	System.out.println(toString1(wat));
	System.out.println(wat.length);
	
	
	}

	
}
