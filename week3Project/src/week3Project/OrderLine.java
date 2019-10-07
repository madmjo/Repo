package week3Project;

public class OrderLine {

	private Article article;
	private int quantity;
	private Order order;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
	public OrderLine (int quantity , Article article , Order order)
	{
		this.quantity = quantity ;
		this.article = article ; 
		this.order = order ; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
