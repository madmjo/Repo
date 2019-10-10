import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.* ;

public class TaskRegister {
private DBConnector dbconnector  = new DBConnector() ;	
private ArrayList<Task> tasks = new ArrayList<Task> () ; 
	

public ArrayList<Task> getTasks()
{return tasks;}

public Task findTask(String taskname)
   {   
	//List<Task> tmptask = tasks.stream().filter(task -> taskname.equals(task.getName())).collect(Collectors.toList()).get(0) ;
	//return ttmptask.get(0);
	return getTasks().stream().filter(task -> taskname.equals(task.getName())).collect(Collectors.toList()).get(0) ;

   }
 
/*
public void addProject (String name , String dueDate )
	{
	 	new Project(name,dueDate);   //creating new anonymous project object	
	}
*/	
	
	//creating new tasks and adding them to project 
public void createTask (String name , String dueDate , Project project)
	{    
	     getTasks().add(new Task(name,dueDate,project)); 
		 project.addTask(project.getName(), findTask(name));
		 dbconnector.createTaskinDB(name,dueDate,project.getName());
		 dbconnector.addTasktoProjectDB(project.getName(), name);
	
	}
	


public void changeDate (String taskName , String date )
{
	
  findTask(taskName).setdueDate(date);	
}



public void changeStatus (String taskName)
{
  findTask(taskName).setStatus("Completed");	
}



public void updateTask (String taskName, int choice,String generic )
    {
	      findTask(taskName).Update();
	      
           if (choice ==1 )
           { 
        	   changeDate(taskName,generic);
           }
           
           
           else if (choice==2)
           {
        	   changeStatus(taskName) ;
           }
           
           else if (choice==3)
        	   
           {   
        	 //  findTask(taskName).getProject().getPTasks().remove(findTask(taskName).getProject().getPTasks().indexOf(findTask(taskName).getProject().findPTask(taskName)));
        	 //  getTasks().remove(getTasks().indexOf(findTask(taskName)));
        	   Task mytask =findTask(taskName);
        	   mytask.getProject().Update();
        	   mytask.getProject().getPTasks().remove(mytask);
        	   getTasks().remove(mytask) ;
        	   
   
           }
           
	}











}





