import java.util.ArrayList;
import java.sql.* ;
public class DBConnector {
	
	
	public void addProjecttoDB(String name , String dueDate)
	{
		//adding to database 	
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
			System.out.println("Connected to Database");
		    String sql = "insert into public.\"Project\" (name,date) VALUES ('" +name+ "','" + dueDate +"') ;";		
		    System.out.println(sql);
		    Statement statement1 = connection.createStatement();
			statement1.executeUpdate(sql) ;
		
	}
	catch (SQLException e) {
			System.out.println("Connecion Failure");
			e.printStackTrace();
		}
			
	}
	
	
	
	
	public void addTasktoProjectDB(String projectName , String Taskname)
	{
		//adding to database 	
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
		    System.out.println("Connected to Database");
		    String sql1 = "select tasks from public.\"Project\" where name ='" + projectName + "';" ;
		    System.out.println(sql1);
		    String return1 = "sup" ;
		    String sql2 = "update public.\"Project\" set tasks='" + return1 + "," + Taskname + "' where name ='" + projectName + "';";		
		    System.out.println(sql2);
		    Statement statement1 = connection.createStatement();		  
			statement1.executeUpdate(sql2) ;
		
	}
	catch (SQLException e) {
			System.out.println("Connecion Failure");
			e.printStackTrace();
		}
	
	}

	
	

	public void createTaskinDB(String taskName,String dueDate,String projectName)
	{
		//adding to database 	
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
		    System.out.println("Connected to Database");
		    String sql0="insert into public.\"Task\" VALUES ('" + taskName +"','" + dueDate + "','Incomplete','" + projectName + "');" ;
		    System.out.println(sql0) ;
		    String sql1 = "select tasks from public.\"Project\" where name ='" + projectName + "';" ;
		    System.out.println(sql1);
		    String return1 = "sup" ;
		    String sql2 = "update public.\"Project\" set tasks='" + return1 + "," + taskName + "' where name ='" + projectName + "';";		
		    System.out.println(sql2);
		    Statement statement1 = connection.createStatement();		  
			statement1.executeUpdate(sql0);
		    statement1.executeUpdate(sql2) ;
		
	}
	catch (SQLException e) {
			System.out.println("Connecion Failure");
			e.printStackTrace();
		}
		
	
	}

	
	
}
