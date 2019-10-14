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


	public ArrayList<String[]> retreiveProjectsFromDB()
	{
		ArrayList<String[]> projectsA = new ArrayList<String[]> () ;		 	
				try {
					Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
					System.out.println("Connected to Database");				
					String sql2 = "Select * from public.\"Project\";";
					Statement statement1 = connection.createStatement();
					ResultSet projectresults = statement1.executeQuery(sql2);
					
			
					while (projectresults.next())
					{
						String[] presultrow = new String[3];
						presultrow[0]=projectresults.getString("name");
						presultrow[1]=projectresults.getString("date");
						presultrow[2]=projectresults.getString("tasks");
						projectsA.add(presultrow) ;
						
					}
					
			}
			catch (SQLException e) {
					System.out.println("Connecion Failure");
					e.printStackTrace();
				}
		return projectsA ;		
		
	}
	
	
	
	public ArrayList<String[]> retreiveTasksFromDB()
	 {
		
		ArrayList<String[]> tasksA = new ArrayList<String[]> () ;
		 	
				try {
					Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
					System.out.println("Connected to Database");
					String sql1 = "Select * from public.\"Task\";";
					Statement statement1 = connection.createStatement();	
					ResultSet taskresults = statement1.executeQuery(sql1);
					while (taskresults.next())
					{
						String[] tresultrow = new String[4];
						tresultrow[0]=taskresults.getString("name");
						tresultrow[1]=taskresults.getString("date");
						tresultrow[2]=taskresults.getString("status");
						tresultrow[3]=taskresults.getString("project");
						tasksA.add(tresultrow);
					}
			
				
					
			}
			catch (SQLException e) {
					System.out.println("Connecion Failure");
					e.printStackTrace();
				}
				
			return tasksA ;
			
	}
	
	
	
	

	public void CreateUpdateTask(String taskName,String dueDate,String status, String projectName )
	{  
		
		try {   
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
		    System.out.println("Connected to Database");
		    String sqlInq =" select * from public.\"Task\" where name='" + taskName + "';" ;
		    String inq = null;
		    String sql0="insert into public.\"Task\" VALUES ('" + taskName +"','" + dueDate +"','" + status + "','" + projectName + "');" ;
		    String sql1="update public.\"Task\" set date ='" + dueDate + "' , status = '" + status +"' where name='" + taskName + "';" ;
		    System.out.println(sql0) ;
		    System.out.println(sql1);
		    Statement statement1 = connection.createStatement();	
		    
		    ResultSet resultset = statement1.executeQuery(sqlInq) ;
			while (resultset.next()) {
			inq = resultset.getString("name");
			System.out.println(inq);
			   }
			
		    if (inq == null )
		        {statement1.executeUpdate(sql0); //adding new Entry
		       System.out.println("New One");}
		    else 
		    	{ statement1.executeUpdate(sql1);
		    	 System.out.println("old One");}  //updating old entry
		    	
				
	}
	catch (SQLException e) {
			System.out.println("Connecion Failure");
			e.printStackTrace();
		}
		
	
	}

	
	
	

	public void CreateUpdateProject(String pName,String dueDate,String tasks)
	{
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDo", "postgres", "database")  ;
		    System.out.println("Connected to Database");
		    String sql0="insert into public.\"Project\" VALUES ('" + pName +"','" + dueDate +"','" + tasks + "');" ;
		    String sql1="update public.\"Project\" set date ='" + dueDate + "' , tasks = '" + tasks +"' where name='" + pName + "';" ;
		    System.out.println(sql0) ;
		    System.out.println(sql1);
		    Statement statement1 = connection.createStatement();		  
			statement1.executeUpdate(sql0);
			
	}
	catch (SQLException e) {
			System.out.println("Connecion Failure");
			e.printStackTrace();
		}
		
	
	}

	
	
	
	
}
