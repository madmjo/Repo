import java.util.ArrayList;
public class Project {
private String name ; 
private String dueDate ; 
private ArrayList<Task> Tasks = new ArrayList<Task> () ; 


//generating accessors and mutators for fields 

public String getName ()
{
  return name ;	
}
	
public String getdueDate()
{
  return dueDate ;	
}

public ArrayList<Task> getTasks()
{
  return Tasks ; 	
}

public void setName (String name )
{
  this.name = name ;	
}

public void setdueDate (String dueDate )
{
  this.dueDate = dueDate ;	
}

public void addTask (Task task )
{
	 getTasks().add(task) ;
}





}
