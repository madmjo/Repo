package week3Project;
import java.util.ArrayList;
public class Supplier {
private String name  ;
private ArrayList<Article> articlelist2 = new ArrayList<Article> () ;

	
	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public void addArticletosupplier (Article article )
{
	articlelist2.add(article) ;
}


public ArrayList<Article> getArticlesfrmsupplier ()
{
return articlelist2 ;	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
