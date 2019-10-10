import java.util.ArrayList;
import java.util.stream.Collectors;
public class Project {
private String name ; 
private String dueDate ; 
private ArrayList<Task> PTasks ;
private DBConnector dbconnector  = new DBConnector() ;
private boolean updated ;

//generating accessors and mutators for fields 

public String getName ()
{
  return name ;	
}
	
public String getdueDate()
{
  return dueDate ;	
}

public ArrayList<Task> getPTasks()
{
  return PTasks ; 	
}

public void setName (String name )
{
  this.name = name ;	
}

public void setdueDate (String dueDate )
{
  this.dueDate = dueDate ;	
}

public void addTask (String projectName , Task task )
{
	 getPTasks().add(task) ;
	 String Taskname = task.getName() ;
	 
}


public void Update()
{
	 this.updated = true ;
}

public boolean isUpdated()
{
 return updated ;	
}




public Task findPTask(String taskname)
{   
	//List<Task> tmptask = tasks.stream().filter(task -> taskname.equals(task.getName())).collect(Collectors.toList()).get(0) ;
	//return ttmptask.get(0);
	return getPTasks().stream().filter(task -> taskname.equals(task.getName())).collect(Collectors.toList()).get(0) ;

}



public Project (String name , String dueDate )  //creating new project and adding entry to db
{
	setName (name);
	setdueDate(dueDate);
	PTasks = new ArrayList<Task> () ; 
	//dbconnector.addProjecttoDB(name, dueDate);
	updated=true ;
}



}
