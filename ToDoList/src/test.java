import java.sql.* ;
public class test {

	//adding driver jar to project for sql class methods to work 
	
	public static void main(String[] args) {
	
	
	
	TaskRegister register1 = new TaskRegister () ; 
   
	Project project1 = new Project ("Project1", "22-10-19") ;
    register1.createTask("task11", "22-1099", project1);
    //Task task1 = new Task("task1","dec","Done",project1);
	//DBConnector dbconnector1 = new DBConnector () ;
	
	//register1.addProject("project1", "22-5-19");
	
     
	System.out.println(register1.findTask("task11").getName());
	
	}

}
