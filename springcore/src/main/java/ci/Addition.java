package ci;

public class Addition {

	private int a;
	private int b;
	
	
	//By default,Adhi String type shodhto, nahi bhetla tr sequentially constructor call hoto!!
	//Explicitly apan type ani sequence configure karu shakto using type and index
	public Addition(double a, double b) {
		
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor: Double,Double");
		
	}
	
	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int,int");
	}
	
	
	
	public void doSum() {
		
		System.out.println("sum = "+ (this.a + this.b));
	}


	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
}
