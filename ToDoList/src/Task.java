
public class Task {
	
private String name ; 
private String dueDate ; 
private String status ; 
private Project project ; 

//generating accessors and mutators for fields 

public String getName()
{
	return name ;
}

public String getdueDate ()
{
    return dueDate ;
}

public String getStatus()
{
   return status ;	
}

public Project getProject ()
{
  return project ;	
}

public void setName (String name)
{
  this.name = name ; 	
}

public void setdueDate(String dueDate)
{
  this.dueDate = dueDate ; 	
}

public void setStatus (String status)
{
this.status = status ;	
}

public void setProject (Project project)
{
	this.project = project ;
}



}
