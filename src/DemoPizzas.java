
public class DemoPizzas {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("deluxe pepperoni", 15.99);
		Pizza p2 = new Pizza("pepperoni", 13.99);
		DeliveryPizza dp1 = new DeliveryPizza("cheese", 12.99, "22 Acorn");
		DeliveryPizza dp2 = new DeliveryPizza("deluxe cheese", 17.99, "12 Acorn");
		
		p1.display();
		p2.display();
		dp1.display();
		dp2.display();
		
	}

}
