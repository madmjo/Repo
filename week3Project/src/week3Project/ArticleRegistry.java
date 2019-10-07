package week3Project;
import java.util.ArrayList;
public class ArticleRegistry {
	private ArrayList<Article> articleList = new ArrayList<Article> () ; 
	
	public void addArticle (Article article)
	{
		articleList.add(article);
	}
	
	public ArrayList<Article> getArticleList ()
	{
		return articleList ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
