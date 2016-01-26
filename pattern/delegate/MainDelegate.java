package pattern.delegate;

public class MainDelegate {

	public static void main(String[] args) {
		Client client = new Client();
		
		client.setOrder(new OrderBeverage());
		client.order();
		
		client.setOrder(new OrderFood());
		client.order();
		
		client.setOrder(new OrderBar());
		client.order();
		
		client.printcheck();

	}

}

interface Order{
	public void order();
}

class OrderFood implements Order{
	public void order(){
		System.out.println("make order for food");
	}
}
class OrderBar implements Order{
	public void order(){
		System.out.println("make order for bar");
	}
}
class OrderBeverage implements Order{
	public void order(){
		System.out.println("make order for beverages");
	}
}
class Client{
	Order order;
	public void setOrder(Order o){
		order = o;
	}
	
	public void order(){
		order.order();
	}
	
	public void printcheck(){
		System.out.println("check");
	}
}

