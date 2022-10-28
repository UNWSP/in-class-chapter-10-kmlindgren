
public class Pizza {
	String description;
	double price;
	
	public Pizza(String desc, double pr) {
		description = desc;
		price = pr;
	}
	
	public void display() {
		System.out.println("Description: " + description + "\nPrice: $" + price);
	}
}
