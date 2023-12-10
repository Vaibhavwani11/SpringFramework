package lifecycle;

public class Samosa {

	private float price; 
	
	public float getPrice() {
		return price;
	}

	public void init() {
		
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		
		System.out.println("Inside Destroy method");
	}
	
	public void setPrice(float price) {
		this.price = price;
		System.out.println("Setting the price");
	}

	public Samosa(float price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		// TODO Auto-generated constructor stub
	}

}
